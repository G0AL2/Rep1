package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.c;
import com.google.gson.internal.h;
import com.google.gson.r;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Collection;

/* loaded from: classes3.dex */
public final class CollectionTypeAdapterFactory implements r {

    /* renamed from: a  reason: collision with root package name */
    private final c f23740a;

    /* loaded from: classes3.dex */
    private static final class Adapter<E> extends TypeAdapter<Collection<E>> {

        /* renamed from: a  reason: collision with root package name */
        private final TypeAdapter<E> f23741a;

        /* renamed from: b  reason: collision with root package name */
        private final h<? extends Collection<E>> f23742b;

        public Adapter(Gson gson, Type type, TypeAdapter<E> typeAdapter, h<? extends Collection<E>> hVar) {
            this.f23741a = new TypeAdapterRuntimeTypeWrapper(gson, typeAdapter, type);
            this.f23742b = hVar;
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: e */
        public Collection<E> b(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            Collection<E> construct = this.f23742b.construct();
            jsonReader.beginArray();
            while (jsonReader.hasNext()) {
                construct.add(this.f23741a.b(jsonReader));
            }
            jsonReader.endArray();
            return construct;
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: f */
        public void d(JsonWriter jsonWriter, Collection<E> collection) throws IOException {
            if (collection == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginArray();
            for (E e10 : collection) {
                this.f23741a.d(jsonWriter, e10);
            }
            jsonWriter.endArray();
        }
    }

    public CollectionTypeAdapterFactory(c cVar) {
        this.f23740a = cVar;
    }

    @Override // com.google.gson.r
    public <T> TypeAdapter<T> a(Gson gson, com.google.gson.reflect.a<T> aVar) {
        Type e10 = aVar.e();
        Class<? super T> c10 = aVar.c();
        if (Collection.class.isAssignableFrom(c10)) {
            Type h10 = com.google.gson.internal.b.h(e10, c10);
            return new Adapter(gson, h10, gson.getAdapter(com.google.gson.reflect.a.b(h10)), this.f23740a.a(aVar));
        }
        return null;
    }
}
