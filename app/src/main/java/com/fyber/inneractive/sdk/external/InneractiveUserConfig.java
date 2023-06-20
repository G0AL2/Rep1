package com.fyber.inneractive.sdk.external;

import com.fyber.inneractive.sdk.util.IAlog;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class InneractiveUserConfig {

    /* renamed from: a  reason: collision with root package name */
    public int f17168a = -1;

    /* renamed from: b  reason: collision with root package name */
    public Gender f17169b = null;
    @Deprecated

    /* renamed from: c  reason: collision with root package name */
    public String f17170c = null;

    /* loaded from: classes.dex */
    public enum Gender {
        MALE,
        FEMALE
    }

    public static boolean ageIsValid(int i10) {
        return i10 >= 1 && i10 <= 120;
    }

    public int getAge() {
        return this.f17168a;
    }

    public Gender getGender() {
        return this.f17169b;
    }

    @Deprecated
    public String getZipCode() {
        return this.f17170c;
    }

    public InneractiveUserConfig setAge(int i10) {
        if (ageIsValid(i10)) {
            this.f17168a = i10;
        } else {
            IAlog.e("The Age is invalid. Please use a number between 1 and 120", new Object[0]);
        }
        return this;
    }

    public InneractiveUserConfig setGender(Gender gender) {
        if (gender != null) {
            this.f17169b = gender;
        } else {
            IAlog.e("The gender is invalid. Please use one of the suggested InneractiveAdView.Gender", new Object[0]);
        }
        return this;
    }

    @Deprecated
    public InneractiveUserConfig setZipCode(String str) {
        if (str != null && Pattern.compile("(^\\d{5}$)|(^\\d{5}-\\d{4}$)").matcher(str).matches()) {
            this.f17170c = str;
        } else {
            IAlog.c("The zipcode format is invalid. Please use a valid value.", new Object[0]);
        }
        return this;
    }
}
