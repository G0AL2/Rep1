package com.google.gson;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class DefaultDateTypeAdapter extends TypeAdapter<Date> {

    /* renamed from: a  reason: collision with root package name */
    private final Class<? extends Date> f23703a;

    /* renamed from: b  reason: collision with root package name */
    private final List<DateFormat> f23704b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public DefaultDateTypeAdapter(Class<? extends Date> cls, String str) {
        ArrayList arrayList = new ArrayList();
        this.f23704b = arrayList;
        this.f23703a = g(cls);
        Locale locale = Locale.US;
        arrayList.add(new SimpleDateFormat(str, locale));
        if (Locale.getDefault().equals(locale)) {
            return;
        }
        arrayList.add(new SimpleDateFormat(str));
    }

    private Date e(String str) {
        synchronized (this.f23704b) {
            for (DateFormat dateFormat : this.f23704b) {
                try {
                    return dateFormat.parse(str);
                } catch (ParseException unused) {
                }
            }
            try {
                return fd.a.c(str, new ParsePosition(0));
            } catch (ParseException e10) {
                throw new p(str, e10);
            }
        }
    }

    private static Class<? extends Date> g(Class<? extends Date> cls) {
        if (cls == Date.class || cls == java.sql.Date.class || cls == Timestamp.class) {
            return cls;
        }
        throw new IllegalArgumentException("Date type must be one of " + Date.class + ", " + Timestamp.class + ", or " + java.sql.Date.class + " but was " + cls);
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: f */
    public Date b(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        Date e10 = e(jsonReader.nextString());
        Class<? extends Date> cls = this.f23703a;
        if (cls == Date.class) {
            return e10;
        }
        if (cls == Timestamp.class) {
            return new Timestamp(e10.getTime());
        }
        if (cls == java.sql.Date.class) {
            return new java.sql.Date(e10.getTime());
        }
        throw new AssertionError();
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: h */
    public void d(JsonWriter jsonWriter, Date date) throws IOException {
        if (date == null) {
            jsonWriter.nullValue();
            return;
        }
        synchronized (this.f23704b) {
            jsonWriter.value(this.f23704b.get(0).format(date));
        }
    }

    public String toString() {
        DateFormat dateFormat = this.f23704b.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            return "DefaultDateTypeAdapter(" + ((SimpleDateFormat) dateFormat).toPattern() + ')';
        }
        return "DefaultDateTypeAdapter(" + dateFormat.getClass().getSimpleName() + ')';
    }

    public DefaultDateTypeAdapter(Class<? extends Date> cls, int i10, int i11) {
        ArrayList arrayList = new ArrayList();
        this.f23704b = arrayList;
        this.f23703a = g(cls);
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(i10, i11, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(i10, i11));
        }
        if (com.google.gson.internal.d.e()) {
            arrayList.add(com.google.gson.internal.i.c(i10, i11));
        }
    }
}
