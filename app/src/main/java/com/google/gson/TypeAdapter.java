package com.google.gson;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/* loaded from: classes3.dex */
public abstract class TypeAdapter<T> {
    public final TypeAdapter<T> a() {
        return new TypeAdapter<T>() { // from class: com.google.gson.TypeAdapter.1
            @Override // com.google.gson.TypeAdapter
            public T b(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                return (T) TypeAdapter.this.b(jsonReader);
            }

            @Override // com.google.gson.TypeAdapter
            public void d(JsonWriter jsonWriter, T t10) throws IOException {
                if (t10 == null) {
                    jsonWriter.nullValue();
                } else {
                    TypeAdapter.this.d(jsonWriter, t10);
                }
            }
        };
    }

    public abstract T b(JsonReader jsonReader) throws IOException;

    public final h c(T t10) {
        try {
            com.google.gson.internal.bind.b bVar = new com.google.gson.internal.bind.b();
            d(bVar, t10);
            return bVar.a();
        } catch (IOException e10) {
            throw new i(e10);
        }
    }

    public abstract void d(JsonWriter jsonWriter, T t10) throws IOException;
}
