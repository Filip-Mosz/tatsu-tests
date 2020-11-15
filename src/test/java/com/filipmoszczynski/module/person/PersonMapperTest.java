package com.filipmoszczynski.module.person;

import org.junit.Test;

import java.util.List;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

public class PersonMapperTest {

    private static final String NAME = "Michał";
    private static final String SURNAME = "Szałkowski";
    private static final String EMAIL = "no@michalszalkowski.com";

    @Test
    public void shouldReturnNull() {
        // given
        PersonEntity nullPerson = null;
        // when
        PersonDto personDto = PersonMapper.map(nullPerson);
        // then
        assertThat(personDto).isNull();

    }

    @Test
    public void shouldReturnDto() {
        // given
        PersonEntity validPerson = new PersonEntity();
        // when
        validPerson.setEmail(EMAIL)
                .setName(NAME)
                .setSurname(SURNAME);

        PersonDto personDto = PersonMapper.map(validPerson);
        // then
        assertThat(personDto).isNotNull();
        assertThat(personDto.isEmailValid()).isTrue();
        assertThat(personDto.getEmail()).isNotNull();
        assertThat(personDto.getName()).isNotNull();
        assertThat(personDto.getSurname()).isNotNull();
    }

    @Test
    public void shouldReturnEmptyList() {
        // given
        List<PersonEntity> list = List.of();
        // when
        List<PersonDto> checklist = PersonMapper.asList(list);
        // then
        assertThat(checklist).isEmpty();
    }

    @Test
    public void shouldReturnList() {
        // given
        List<PersonEntity> list = List.of(
                new PersonEntity().setName(NAME).setSurname(SURNAME).setEmail(EMAIL),
                new PersonEntity().setName(NAME).setSurname(SURNAME).setEmail(EMAIL),
                new PersonEntity().setName(NAME).setSurname(SURNAME).setEmail(EMAIL)
        );
        // when
        List<PersonDto> checklist = PersonMapper.asList(list);
        // then
        assertThat(checklist)
                .isNotEmpty()
                .hasSize(3);
    }

    @Test
    public void shouldReturnSet() {
        // given
        List<PersonEntity> list = List.of(
                new PersonEntity().setName(NAME).setSurname(SURNAME).setEmail(EMAIL),
                new PersonEntity().setName(NAME).setSurname(SURNAME).setEmail(EMAIL),
                new PersonEntity().setName(NAME).setSurname(SURNAME).setEmail(EMAIL)
        );
        // when
        Set<PersonDto> checklist = PersonMapper.asSet(list);
        // then
        assertThat(checklist)
                .isNotEmpty()
                .hasSize(1);
    }
}