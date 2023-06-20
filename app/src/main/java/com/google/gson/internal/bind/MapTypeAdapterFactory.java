package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.c;
import com.google.gson.internal.e;
import com.google.gson.internal.h;
import com.google.gson.internal.k;
import com.google.gson.m;
import com.google.gson.p;
import com.google.gson.r;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes3.dex */
public final class MapTypeAdapterFactory implements r {

    /* renamed from: a  reason: collision with root package name */
    private final c f23746a;

    /* renamed from: b  reason: collision with root package name */
    final boolean f23747b;

    /* loaded from: classes3.dex */
    private final class Adapter<K, V> extends TypeAdapter<Map<K, V>> {

        /* renamed from: a  reason: collision with root package name */
        private final TypeAdapter<K> f23748a;

        /* renamed from: b  reason: collision with root package name */
        private final TypeAdapter<V> f23749b;

        /* renamed from: c  reason: collision with root package name */
        private final h<? extends Map<K, V>> f23750c;

        public Adapter(Gson gson, Type type, TypeAdapter<K> typeAdapter, Type type2, TypeAdapter<V> typeAdapter2, h<? extends Map<K, V>> hVar) {
            this.f23748a = new TypeAdapterRuntimeTypeWrapper(gson, typeAdapter, type);
            this.f23749b = new TypeAdapterRuntimeTypeWrapper(gson, typeAdapter2, type2);
            this.f23750c = hVar;
        }

        private String e(com.google.gson.h hVar) {
            if (hVar.l()) {
                m g10 = hVar.g();
                if (g10.u()) {
                    return String.valueOf(g10.r());
                }
                if (g10.s()) {
                    return Boolean.toString(g10.m());
                }
                if (g10.w()) {
                    return g10.h();
                }
                throw new AssertionError();
            } else if (hVar.j()) {
                return "null";
            } else {
                throw new AssertionError();
            }
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: f */
        public Map<K, V> b(JsonReader jsonReader) throws IOException {
            JsonToken peek = jsonReader.peek();
            if (peek == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            Map<K, V> construct = this.f23750c.construct();
            if (peek == JsonToken.BEGIN_ARRAY) {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    jsonReader.beginArray();
                    K b10 = this.f23748a.b(jsonReader);
                    if (construct.put(b10, this.f23749b.b(jsonReader)) == null) {
                        jsonReader.endArray();
                    } else {
                        throw new p("duplicate key: " + b10);
                    }
                }
                jsonReader.endArray();
            } else {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    e.INSTANCE.promoteNameToValue(jsonReader);
                    K b11 = this.f23748a.b(jsonReader);
                    if (construct.put(b11, this.f23749b.b(jsonReader)) != null) {
                        throw new p("duplicate key: " + b11);
                    }
                }
                jsonReader.endObject();
            }
            return construct;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.gson.TypeAdapter
        /* renamed from: g */
        public void d(JsonWriter jsonWriter, Map<K, V> map) throws IOException {
            if (map == null) {
                jsonWriter.nullValue();
            } else if (!MapTypeAdapterFactory.this.f23747b) {
                jsonWriter.beginObject();
                for (Map.Entry<K, V> entry : map.entrySet()) {
                    jsonWriter.name(String.valueOf(entry.getKey()));
                    this.f23749b.d(jsonWriter, entry.getValue());
                }
                jsonWriter.endObject();
            } else {
                ArrayList arrayList = new ArrayList(map.size());
                ArrayList arrayList2 = new ArrayList(map.size());
                int i10 = 0;
                boolean z10 = false;
                for (Map.Entry<K, V> entry2 : map.entrySet()) {
                    com.google.gson.h c10 = this.f23748a.c(entry2.getKey());
                    arrayList.add(c10);
                    arrayList2.add(entry2.getValue());
                    z10 |= c10.i() || c10.k();
                }
                if (z10) {
                    jsonWriter.beginArray();
                    int size = arrayList.size();
                    while (i10 < size) {
                        jsonWriter.beginArray();
                        k.b((com.google.gson.h) arrayList.get(i10), jsonWriter);
                        this.f23749b.d(jsonWriter, arrayList2.get(i10));
                        jsonWriter.endArray();
                        i10++;
                    }
                    jsonWriter.endArray();
                    return;
                }
                jsonWriter.beginObject();
                int size2 = arrayList.size();
                while (i10 < size2) {
                    jsonWriter.name(e((com.google.gson.h) arrayList.get(i10)));
                    this.f23749b.d(jsonWriter, arrayList2.get(i10));
                    i10++;
                }
                jsonWriter.endObject();
            }
        }
    }

    public MapTypeAdapterFactory(c cVar, boolean z10) {
        this.f23746a = cVar;
        this.f23747b = z10;
    }

    private TypeAdapter<?> b(Gson gson, Type type) {
        if (type != Boolean.TYPE && type != Boolean.class) {
            return gson.getAdapter(com.google.gson.reflect.a.b(type));
        }
        return TypeAdapters.f23796f;
    }

    @Override // com.google.gson.r
    public <T> TypeAdapter<T> a(Gson gson, com.google.gson.reflect.a<T> aVar) {
        Type e10 = aVar.e();
        if (Map.class.isAssignableFrom(aVar.c())) {
            Type[] j10 = com.google.gson.internal.b.j(e10, com.google.gson.internal.b.k(e10));
            return new Adapter(gson, j10[0], b(gson, j10[0]), j10[1], gson.getAdapter(com.google.gson.reflect.a.b(j10[1])), this.f23746a.a(aVar));
        }
        return null;
    }
}
