package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.r;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class ArrayTypeAdapter<E> extends TypeAdapter<Object> {

    /* renamed from: c  reason: collision with root package name */
    public static final r f23737c = new r() { // from class: com.google.gson.internal.bind.ArrayTypeAdapter.1
        @Override // com.google.gson.r
        public <T> TypeAdapter<T> a(Gson gson, com.google.gson.reflect.a<T> aVar) {
            Type e10 = aVar.e();
            if ((e10 instanceof GenericArrayType) || ((e10 instanceof Class) && ((Class) e10).isArray())) {
                Type g10 = com.google.gson.internal.b.g(e10);
                return new ArrayTypeAdapter(gson, gson.getAdapter(com.google.gson.reflect.a.b(g10)), com.google.gson.internal.b.k(g10));
            }
            return null;
        }
    };

    /* renamed from: a  reason: collision with root package name */
    private final Class<E> f23738a;

    /* renamed from: b  reason: collision with root package name */
    private final TypeAdapter<E> f23739b;

    public ArrayTypeAdapter(Gson gson, TypeAdapter<E> typeAdapter, Class<E> cls) {
        this.f23739b = new TypeAdapterRuntimeTypeWrapper(gson, typeAdapter, cls);
        this.f23738a = cls;
    }

    @Override // com.google.gson.TypeAdapter
    public Object b(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(this.f23739b.b(jsonReader));
        }
        jsonReader.endArray();
        int size = arrayList.size();
        Object newInstance = Array.newInstance((Class<?>) this.f23738a, size);
        for (int i10 = 0; i10 < size; i10++) {
            Array.set(newInstance, i10, arrayList.get(i10));
        }
        return newInstance;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.gson.TypeAdapter
    public void d(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        jsonWriter.beginArray();
        int length = Array.getLength(obj);
        for (int i10 = 0; i10 < length; i10++) {
            this.f23739b.d(jsonWriter, Array.get(obj, i10));
        }
        jsonWriter.endArray();
    }
}
