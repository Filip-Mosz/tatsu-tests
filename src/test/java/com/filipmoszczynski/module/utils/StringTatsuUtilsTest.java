package com.filipmoszczynski.module.utils;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StringTatsuUtilsTest {

    @Test
    public void shouldReturnTrueWhenProductionIsOn() {
        assertThat(StringTatsuUtils.isProductionState()).isTrue();
    }

    @Test
    public void shouldReturnFalseWhenDevIsOff() {
        assertThat(StringTatsuUtils.isDevState()).isFalse();
    }

    @Test
    public void shouldReturnTrueWhenStringIsBlank() {
        assertThat(StringTatsuUtils.isBlank("")).isTrue();
        assertThat(StringTatsuUtils.isBlank(null)).isTrue();
        assertThat(StringTatsuUtils.isBlank("      ")).isTrue();
    }

    @Test
    public void shouldReturnFalseWhenStringIsNotBlank() {
        assertThat(StringTatsuUtils.isBlank("thing")).isFalse();
        assertThat(StringTatsuUtils.isBlank("two things")).isFalse();
        assertThat(StringTatsuUtils.isBlank("   more  things with spaces  ")).isFalse();
        assertThat(StringTatsuUtils.isBlank("   s  ")).isFalse();
    }

    @Test
    public void shouldReturnFalseWhenEmailIsNotValid() {
        assertThat(StringTatsuUtils.isEmail("")).isFalse();
        assertThat(StringTatsuUtils.isEmail("to nie jest email")).isFalse();
        assertThat(StringTatsuUtils.isEmail(null)).isFalse();
        assertThat(StringTatsuUtils.isEmail("l")).isFalse();
        assertThat(StringTatsuUtils.isEmail("login@host")).isFalse();
        assertThat(StringTatsuUtils.isEmail("login.host.domena")).isFalse();
        assertThat(StringTatsuUtils.isEmail("@host.domena")).isFalse();
        assertThat(StringTatsuUtils.isEmail("lo gin@host.domena")).isFalse();
        assertThat(StringTatsuUtils.isEmail("ło gin@host.domęną")).isFalse();
    }

    @Test
    public void shouldReturnTrueWhenEmailIsValid() {
        assertThat(StringTatsuUtils.isEmail("login@host.domena")).isTrue();
        assertThat(StringTatsuUtils.isEmail("LOGIN@host.domena")).isTrue();
        assertThat(StringTatsuUtils.isEmail("LOGIN@HOST.domena")).isTrue();
    }

    @Test
    public void shouldReturnFullName() {
        assertThat(StringTatsuUtils.getFullName("John", "Doe"))
                .isEqualTo("John Doe")
                .isNotNull()
                .isNotBlank();


        assertThat(StringTatsuUtils.getFullName(null, "  Doe  "))
                .isEqualTo("Doe")
                .isNotNull()
                .isNotBlank();

        assertThat(StringTatsuUtils.getFullName("Joe  ", null))
                .isEqualTo("Joe")
                .isNotNull()
                .isNotBlank();


        assertThat(StringTatsuUtils.getFullName(null, null))
                .isEqualTo("")
                .isNotNull();
    }
}