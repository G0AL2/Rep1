package com.facebook.hermes.intl;

import com.facebook.hermes.intl.c;
import java.text.AttributedCharacterIterator;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* compiled from: PlatformDateTimeFormatterAndroid.java */
/* loaded from: classes.dex */
public class q implements c {

    /* renamed from: a  reason: collision with root package name */
    private DateFormat f14750a = null;

    /* compiled from: PlatformDateTimeFormatterAndroid.java */
    /* loaded from: classes.dex */
    private static class a {
        public static String a(String str) {
            StringBuilder sb2 = new StringBuilder();
            boolean z10 = false;
            for (int i10 = 0; i10 < str.length(); i10++) {
                char charAt = str.charAt(i10);
                if (charAt == '\'') {
                    z10 = !z10;
                } else if (!z10 && ((charAt >= 'A' && charAt <= 'Z') || (charAt >= 'a' && charAt <= 'z'))) {
                    sb2.append(str.charAt(i10));
                }
            }
            return sb2.toString();
        }
    }

    @Override // com.facebook.hermes.intl.c
    public String a(com.facebook.hermes.intl.a<?> aVar) {
        return "latn";
    }

    @Override // com.facebook.hermes.intl.c
    public AttributedCharacterIterator b(double d10) {
        return this.f14750a.formatToCharacterIterator(Double.valueOf(d10));
    }

    @Override // com.facebook.hermes.intl.c
    public String c(double d10) {
        return this.f14750a.format(new Date((long) d10));
    }

    @Override // com.facebook.hermes.intl.c
    public String d(com.facebook.hermes.intl.a<?> aVar) throws i5.d {
        return Calendar.getInstance((Locale) aVar.h()).getTimeZone().getID();
    }

    @Override // com.facebook.hermes.intl.c
    public String e(AttributedCharacterIterator.Attribute attribute, String str) {
        if (attribute == DateFormat.Field.DAY_OF_WEEK) {
            return "weekday";
        }
        if (attribute == DateFormat.Field.ERA) {
            return "era";
        }
        if (attribute != DateFormat.Field.YEAR) {
            return attribute == DateFormat.Field.MONTH ? "month" : attribute == DateFormat.Field.DAY_OF_MONTH ? "day" : (attribute == DateFormat.Field.HOUR0 || attribute == DateFormat.Field.HOUR1 || attribute == DateFormat.Field.HOUR_OF_DAY0 || attribute == DateFormat.Field.HOUR_OF_DAY1) ? "hour" : attribute == DateFormat.Field.MINUTE ? "minute" : attribute == DateFormat.Field.SECOND ? "second" : attribute == DateFormat.Field.TIME_ZONE ? "timeZoneName" : attribute == DateFormat.Field.AM_PM ? "dayPeriod" : attribute.toString().equals("android.icu.text.DateFormat$Field(related year)") ? "relatedYear" : "literal";
        }
        try {
            Double.parseDouble(str);
            return "year";
        } catch (NumberFormatException unused) {
            return "yearName";
        }
    }

    @Override // com.facebook.hermes.intl.c
    public String f(com.facebook.hermes.intl.a<?> aVar) throws i5.d {
        return DateFormat.getDateInstance(3, (Locale) aVar.h()).getCalendar().toString();
    }

    @Override // com.facebook.hermes.intl.c
    public void g(com.facebook.hermes.intl.a<?> aVar, String str, String str2, c.d dVar, c.k kVar, c.EnumC0195c enumC0195c, c.l lVar, c.h hVar, c.b bVar, c.e eVar, c.g gVar, c.i iVar, c.j jVar, c.f fVar, Object obj) throws i5.d {
        if (!str.isEmpty()) {
            ArrayList<String> arrayList = new ArrayList<>();
            arrayList.add(i5.c.h(str));
            aVar.f("ca", arrayList);
        }
        if (!str2.isEmpty()) {
            ArrayList<String> arrayList2 = new ArrayList<>();
            arrayList2.add(i5.c.h(str2));
            aVar.f("nu", arrayList2);
        }
        boolean z10 = true;
        boolean z11 = (lVar == null && hVar == null && bVar == null) ? false : true;
        if (eVar == null && gVar == null && iVar == null) {
            z10 = false;
        }
        if (z11 && z10) {
            this.f14750a = DateFormat.getDateTimeInstance(0, 0, (Locale) aVar.h());
        } else if (z11) {
            this.f14750a = DateFormat.getDateInstance(0, (Locale) aVar.h());
        } else if (z10) {
            this.f14750a = DateFormat.getTimeInstance(0, (Locale) aVar.h());
        }
        if (i5.c.n(obj) || i5.c.j(obj)) {
            return;
        }
        this.f14750a.setTimeZone(TimeZone.getTimeZone(i5.c.h(obj)));
    }

    @Override // com.facebook.hermes.intl.c
    public c.f h(com.facebook.hermes.intl.a<?> aVar) throws i5.d {
        c.f fVar;
        try {
            String a10 = a.a(((SimpleDateFormat) DateFormat.getTimeInstance(0, (Locale) aVar.h())).toPattern());
            if (a10.contains(String.valueOf('h'))) {
                fVar = c.f.H12;
            } else if (a10.contains(String.valueOf('K'))) {
                fVar = c.f.H11;
            } else if (a10.contains(String.valueOf('H'))) {
                fVar = c.f.H23;
            } else {
                fVar = c.f.H24;
            }
            return fVar;
        } catch (ClassCastException unused) {
            return c.f.H24;
        }
    }
}
