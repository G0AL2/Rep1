package com.google.gson;

import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;
import java.lang.reflect.Field;
import java.util.Locale;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FieldNamingPolicy.java */
/* loaded from: classes3.dex */
public abstract class c implements FieldNamingStrategy {

    /* renamed from: a  reason: collision with root package name */
    public static final c f23709a;

    /* renamed from: b  reason: collision with root package name */
    public static final c f23710b;

    /* renamed from: c  reason: collision with root package name */
    public static final c f23711c;

    /* renamed from: d  reason: collision with root package name */
    public static final c f23712d;

    /* renamed from: e  reason: collision with root package name */
    public static final c f23713e;

    /* renamed from: f  reason: collision with root package name */
    public static final c f23714f;

    /* renamed from: g  reason: collision with root package name */
    private static final /* synthetic */ c[] f23715g;

    /* compiled from: FieldNamingPolicy.java */
    /* loaded from: classes3.dex */
    enum a extends c {
        a(String str, int i10) {
            super(str, i10, null);
        }

        @Override // com.google.gson.FieldNamingStrategy
        public String translateName(Field field) {
            return field.getName();
        }
    }

    static {
        a aVar = new a("IDENTITY", 0);
        f23709a = aVar;
        c cVar = new c("UPPER_CAMEL_CASE", 1) { // from class: com.google.gson.c.b
            @Override // com.google.gson.FieldNamingStrategy
            public String translateName(Field field) {
                return c.c(field.getName());
            }
        };
        f23710b = cVar;
        c cVar2 = new c("UPPER_CAMEL_CASE_WITH_SPACES", 2) { // from class: com.google.gson.c.c
            @Override // com.google.gson.FieldNamingStrategy
            public String translateName(Field field) {
                return c.c(c.b(field.getName(), " "));
            }
        };
        f23711c = cVar2;
        c cVar3 = new c("LOWER_CASE_WITH_UNDERSCORES", 3) { // from class: com.google.gson.c.d
            @Override // com.google.gson.FieldNamingStrategy
            public String translateName(Field field) {
                return c.b(field.getName(), "_").toLowerCase(Locale.ENGLISH);
            }
        };
        f23712d = cVar3;
        c cVar4 = new c("LOWER_CASE_WITH_DASHES", 4) { // from class: com.google.gson.c.e
            @Override // com.google.gson.FieldNamingStrategy
            public String translateName(Field field) {
                return c.b(field.getName(), Constants.FILENAME_SEQUENCE_SEPARATOR).toLowerCase(Locale.ENGLISH);
            }
        };
        f23713e = cVar4;
        c cVar5 = new c("LOWER_CASE_WITH_DOTS", 5) { // from class: com.google.gson.c.f
            @Override // com.google.gson.FieldNamingStrategy
            public String translateName(Field field) {
                return c.b(field.getName(), ".").toLowerCase(Locale.ENGLISH);
            }
        };
        f23714f = cVar5;
        f23715g = new c[]{aVar, cVar, cVar2, cVar3, cVar4, cVar5};
    }

    private c(String str, int i10) {
    }

    private static String a(char c10, String str, int i10) {
        if (i10 < str.length()) {
            return c10 + str.substring(i10);
        }
        return String.valueOf(c10);
    }

    static String b(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char charAt = str.charAt(i10);
            if (Character.isUpperCase(charAt) && sb2.length() != 0) {
                sb2.append(str2);
            }
            sb2.append(charAt);
        }
        return sb2.toString();
    }

    static String c(String str) {
        StringBuilder sb2 = new StringBuilder();
        int i10 = 0;
        char charAt = str.charAt(0);
        int length = str.length();
        while (i10 < length - 1 && !Character.isLetter(charAt)) {
            sb2.append(charAt);
            i10++;
            charAt = str.charAt(i10);
        }
        if (Character.isUpperCase(charAt)) {
            return str;
        }
        sb2.append(a(Character.toUpperCase(charAt), str, i10 + 1));
        return sb2.toString();
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f23715g.clone();
    }

    /* synthetic */ c(String str, int i10, a aVar) {
        this(str, i10);
    }
}
