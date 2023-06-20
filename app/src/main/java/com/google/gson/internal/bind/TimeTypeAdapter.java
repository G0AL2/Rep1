package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.p;
import com.google.gson.r;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/* loaded from: classes3.dex */
public final class TimeTypeAdapter extends TypeAdapter<Time> {

    /* renamed from: b  reason: collision with root package name */
    public static final r f23773b = new r() { // from class: com.google.gson.internal.bind.TimeTypeAdapter.1
        @Override // com.google.gson.r
        public <T> TypeAdapter<T> a(Gson gson, com.google.gson.reflect.a<T> aVar) {
            if (aVar.c() == Time.class) {
                return new TimeTypeAdapter();
            }
            return null;
        }
    };

    /* renamed from: a  reason: collision with root package name */
    private final DateFormat f23774a = new SimpleDateFormat("hh:mm:ss a");

    @Override // com.google.gson.TypeAdapter
    /* renamed from: e */
    public synchronized Time b(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        try {
            return new Time(this.f23774a.parse(jsonReader.nextString()).getTime());
        } catch (ParseException e10) {
            throw new p(e10);
        }
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: f */
    public synchronized void d(JsonWriter jsonWriter, Time time) throws IOException {
        jsonWriter.value(time == null ? null : this.f23774a.format((Date) time));
    }
}
