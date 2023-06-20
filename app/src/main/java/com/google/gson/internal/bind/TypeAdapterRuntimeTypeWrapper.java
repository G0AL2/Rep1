package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class TypeAdapterRuntimeTypeWrapper<T> extends TypeAdapter<T> {

    /* renamed from: a  reason: collision with root package name */
    private final Gson f23788a;

    /* renamed from: b  reason: collision with root package name */
    private final TypeAdapter<T> f23789b;

    /* renamed from: c  reason: collision with root package name */
    private final Type f23790c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public TypeAdapterRuntimeTypeWrapper(Gson gson, TypeAdapter<T> typeAdapter, Type type) {
        this.f23788a = gson;
        this.f23789b = typeAdapter;
        this.f23790c = type;
    }

    private Type e(Type type, Object obj) {
        return obj != null ? (type == Object.class || (type instanceof TypeVariable) || (type instanceof Class)) ? obj.getClass() : type : type;
    }

    @Override // com.google.gson.TypeAdapter
    public T b(JsonReader jsonReader) throws IOException {
        return this.f23789b.b(jsonReader);
    }

    @Override // com.google.gson.TypeAdapter
    public void d(JsonWriter jsonWriter, T t10) throws IOException {
        TypeAdapter<T> typeAdapter = this.f23789b;
        Type e10 = e(this.f23790c, t10);
        if (e10 != this.f23790c) {
            typeAdapter = this.f23788a.getAdapter(com.google.gson.reflect.a.b(e10));
            if (typeAdapter instanceof ReflectiveTypeAdapterFactory.Adapter) {
                TypeAdapter<T> typeAdapter2 = this.f23789b;
                if (!(typeAdapter2 instanceof ReflectiveTypeAdapterFactory.Adapter)) {
                    typeAdapter = typeAdapter2;
                }
            }
        }
        typeAdapter.d(jsonWriter, t10);
    }
}
