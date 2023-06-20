package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.g;
import com.google.gson.r;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class ObjectTypeAdapter extends TypeAdapter<Object> {

    /* renamed from: b  reason: collision with root package name */
    public static final r f23752b = new r() { // from class: com.google.gson.internal.bind.ObjectTypeAdapter.1
        @Override // com.google.gson.r
        public <T> TypeAdapter<T> a(Gson gson, com.google.gson.reflect.a<T> aVar) {
            if (aVar.c() == Object.class) {
                return new ObjectTypeAdapter(gson);
            }
            return null;
        }
    };

    /* renamed from: a  reason: collision with root package name */
    private final Gson f23753a;

    /* loaded from: classes3.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f23754a;

        static {
            int[] iArr = new int[JsonToken.values().length];
            f23754a = iArr;
            try {
                iArr[JsonToken.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23754a[JsonToken.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23754a[JsonToken.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f23754a[JsonToken.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f23754a[JsonToken.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f23754a[JsonToken.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    ObjectTypeAdapter(Gson gson) {
        this.f23753a = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public Object b(JsonReader jsonReader) throws IOException {
        switch (a.f23754a[jsonReader.peek().ordinal()]) {
            case 1:
                ArrayList arrayList = new ArrayList();
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    arrayList.add(b(jsonReader));
                }
                jsonReader.endArray();
                return arrayList;
            case 2:
                g gVar = new g();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    gVar.put(jsonReader.nextName(), b(jsonReader));
                }
                jsonReader.endObject();
                return gVar;
            case 3:
                return jsonReader.nextString();
            case 4:
                return Double.valueOf(jsonReader.nextDouble());
            case 5:
                return Boolean.valueOf(jsonReader.nextBoolean());
            case 6:
                jsonReader.nextNull();
                return null;
            default:
                throw new IllegalStateException();
        }
    }

    @Override // com.google.gson.TypeAdapter
    public void d(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        TypeAdapter adapter = this.f23753a.getAdapter(obj.getClass());
        if (adapter instanceof ObjectTypeAdapter) {
            jsonWriter.beginObject();
            jsonWriter.endObject();
            return;
        }
        adapter.d(jsonWriter, obj);
    }
}
