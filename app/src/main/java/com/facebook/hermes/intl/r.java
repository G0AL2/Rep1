package com.facebook.hermes.intl;

import android.icu.text.DateFormat;
import android.icu.text.NumberingSystem;
import android.icu.text.SimpleDateFormat;
import android.icu.util.Calendar;
import android.icu.util.TimeZone;
import android.icu.util.ULocale;
import com.facebook.hermes.intl.c;
import java.text.AttributedCharacterIterator;
import java.util.ArrayList;
import java.util.Date;

/* compiled from: PlatformDateTimeFormatterICU.java */
/* loaded from: classes.dex */
public class r implements c {

    /* renamed from: a  reason: collision with root package name */
    private DateFormat f14751a = null;

    /* compiled from: PlatformDateTimeFormatterICU.java */
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

    private static String i(c.k kVar, c.EnumC0195c enumC0195c, c.l lVar, c.h hVar, c.b bVar, c.e eVar, c.g gVar, c.i iVar, c.j jVar, boolean z10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(kVar.f());
        sb2.append(enumC0195c.f());
        sb2.append(lVar.f());
        sb2.append(hVar.f());
        sb2.append(bVar.f());
        if (z10) {
            sb2.append(eVar.f());
        } else {
            sb2.append(eVar.g());
        }
        sb2.append(gVar.f());
        sb2.append(iVar.f());
        sb2.append(jVar.f());
        return sb2.toString();
    }

    @Override // com.facebook.hermes.intl.c
    public String a(com.facebook.hermes.intl.a<?> aVar) throws i5.d {
        return NumberingSystem.getInstance((ULocale) aVar.h()).getName();
    }

    @Override // com.facebook.hermes.intl.c
    public AttributedCharacterIterator b(double d10) {
        return this.f14751a.formatToCharacterIterator(Double.valueOf(d10));
    }

    @Override // com.facebook.hermes.intl.c
    public String c(double d10) {
        return this.f14751a.format(new Date((long) d10));
    }

    @Override // com.facebook.hermes.intl.c
    public String d(com.facebook.hermes.intl.a<?> aVar) throws i5.d {
        return Calendar.getInstance((ULocale) aVar.h()).getTimeZone().getID();
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
        return u.d(DateFormat.getDateInstance(3, (ULocale) aVar.h()).getCalendar().getType());
    }

    @Override // com.facebook.hermes.intl.c
    public void g(com.facebook.hermes.intl.a<?> aVar, String str, String str2, c.d dVar, c.k kVar, c.EnumC0195c enumC0195c, c.l lVar, c.h hVar, c.b bVar, c.e eVar, c.g gVar, c.i iVar, c.j jVar, c.f fVar, Object obj) throws i5.d {
        String i10 = i(kVar, enumC0195c, lVar, hVar, bVar, eVar, gVar, iVar, jVar, fVar == c.f.H11 || fVar == c.f.H12);
        Calendar calendar = null;
        if (!str.isEmpty()) {
            ArrayList<String> arrayList = new ArrayList<>();
            arrayList.add(i5.c.h(str));
            com.facebook.hermes.intl.a<?> d10 = aVar.d();
            d10.f("ca", arrayList);
            calendar = Calendar.getInstance((ULocale) d10.h());
        }
        if (!str2.isEmpty()) {
            try {
                if (NumberingSystem.getInstanceByName(i5.c.h(str2)) != null) {
                    ArrayList<String> arrayList2 = new ArrayList<>();
                    arrayList2.add(i5.c.h(str2));
                    aVar.f("nu", arrayList2);
                } else {
                    throw new i5.d("Invalid numbering system: " + str2);
                }
            } catch (RuntimeException unused) {
                throw new i5.d("Invalid numbering system: " + str2);
            }
        }
        if (calendar != null) {
            this.f14751a = DateFormat.getPatternInstance(calendar, i10, (ULocale) aVar.h());
        } else {
            this.f14751a = DateFormat.getPatternInstance(i10, (ULocale) aVar.h());
        }
        if (i5.c.n(obj) || i5.c.j(obj)) {
            return;
        }
        this.f14751a.setTimeZone(TimeZone.getTimeZone(i5.c.h(obj)));
    }

    @Override // com.facebook.hermes.intl.c
    public c.f h(com.facebook.hermes.intl.a<?> aVar) throws i5.d {
        c.f fVar;
        try {
            String a10 = a.a(((SimpleDateFormat) DateFormat.getTimeInstance(0, (ULocale) aVar.h())).toPattern());
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
