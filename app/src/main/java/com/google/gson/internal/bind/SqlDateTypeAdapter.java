package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.p;
import com.google.gson.r;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/* loaded from: classes3.dex */
public final class SqlDateTypeAdapter extends TypeAdapter<Date> {

    /* renamed from: b  reason: collision with root package name */
    public static final r f23771b = new r() { // from class: com.google.gson.internal.bind.SqlDateTypeAdapter.1
        @Override // com.google.gson.r
        public <T> TypeAdapter<T> a(Gson gson, com.google.gson.reflect.a<T> aVar) {
            if (aVar.c() == Date.class) {
                return new SqlDateTypeAdapter();
            }
            return null;
        }
    };

    /* renamed from: a  reason: collision with root package name */
    private final DateFormat f23772a = new SimpleDateFormat("MMM d, yyyy");

    @Override // com.google.gson.TypeAdapter
    /* renamed from: e */
    public synchronized Date b(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        try {
            return new Date(this.f23772a.parse(jsonReader.nextString()).getTime());
        } catch (ParseException e10) {
            throw new p(e10);
        }
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: f */
    public synchronized void d(JsonWriter jsonWriter, Date date) throws IOException {
        jsonWriter.value(date == null ? null : this.f23772a.format((java.util.Date) date));
    }
}
