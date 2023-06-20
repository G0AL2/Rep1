package com.google.android.material.datepicker;

import android.annotation.TargetApi;
import android.icu.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

/* compiled from: UtcDates.java */
/* loaded from: classes2.dex */
class n {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static long a(long j10) {
        Calendar k10 = k();
        k10.setTimeInMillis(j10);
        return d(k10).getTimeInMillis();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @TargetApi(24)
    public static DateFormat b(Locale locale) {
        return c("MMMEd", locale);
    }

    @TargetApi(24)
    private static DateFormat c(String str, Locale locale) {
        DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton(str, locale);
        instanceForSkeleton.setTimeZone(j());
        return instanceForSkeleton;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Calendar d(Calendar calendar) {
        Calendar l10 = l(calendar);
        Calendar k10 = k();
        k10.set(l10.get(1), l10.get(2), l10.get(5));
        return k10;
    }

    private static java.text.DateFormat e(int i10, Locale locale) {
        java.text.DateFormat dateInstance = java.text.DateFormat.getDateInstance(i10, locale);
        dateInstance.setTimeZone(h());
        return dateInstance;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static java.text.DateFormat f(Locale locale) {
        return e(0, locale);
    }

    private static SimpleDateFormat g(String str, Locale locale) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, locale);
        simpleDateFormat.setTimeZone(h());
        return simpleDateFormat;
    }

    private static TimeZone h() {
        return TimeZone.getTimeZone("UTC");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Calendar i() {
        return d(Calendar.getInstance());
    }

    @TargetApi(24)
    private static android.icu.util.TimeZone j() {
        return android.icu.util.TimeZone.getTimeZone("UTC");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Calendar k() {
        return l(null);
    }

    static Calendar l(Calendar calendar) {
        Calendar calendar2 = Calendar.getInstance(h());
        if (calendar == null) {
            calendar2.clear();
        } else {
            calendar2.setTimeInMillis(calendar.getTimeInMillis());
        }
        return calendar2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @TargetApi(24)
    public static DateFormat m(Locale locale) {
        return c("yMMMEd", locale);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static SimpleDateFormat n() {
        return o(Locale.getDefault());
    }

    private static SimpleDateFormat o(Locale locale) {
        return g("MMMM, yyyy", locale);
    }
}
