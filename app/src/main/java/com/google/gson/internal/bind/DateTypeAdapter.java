package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.d;
import com.google.gson.internal.i;
import com.google.gson.p;
import com.google.gson.r;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class DateTypeAdapter extends TypeAdapter<Date> {

    /* renamed from: b  reason: collision with root package name */
    public static final r f23743b = new r() { // from class: com.google.gson.internal.bind.DateTypeAdapter.1
        @Override // com.google.gson.r
        public <T> TypeAdapter<T> a(Gson gson, com.google.gson.reflect.a<T> aVar) {
            if (aVar.c() == Date.class) {
                return new DateTypeAdapter();
            }
            return null;
        }
    };

    /* renamed from: a  reason: collision with root package name */
    private final List<DateFormat> f23744a;

    public DateTypeAdapter() {
        ArrayList arrayList = new ArrayList();
        this.f23744a = arrayList;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (d.e()) {
            arrayList.add(i.c(2, 2));
        }
    }

    private synchronized Date e(String str) {
        for (DateFormat dateFormat : this.f23744a) {
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

    @Override // com.google.gson.TypeAdapter
    /* renamed from: f */
    public Date b(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        return e(jsonReader.nextString());
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: g */
    public synchronized void d(JsonWriter jsonWriter, Date date) throws IOException {
        if (date == null) {
            jsonWriter.nullValue();
        } else {
            jsonWriter.value(this.f23744a.get(0).format(date));
        }
    }
}
