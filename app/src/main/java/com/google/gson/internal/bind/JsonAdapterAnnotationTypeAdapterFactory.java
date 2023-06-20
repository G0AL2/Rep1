package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.g;
import com.google.gson.internal.c;
import com.google.gson.o;
import com.google.gson.r;

/* loaded from: classes3.dex */
public final class JsonAdapterAnnotationTypeAdapterFactory implements r {

    /* renamed from: a  reason: collision with root package name */
    private final c f23745a;

    public JsonAdapterAnnotationTypeAdapterFactory(c cVar) {
        this.f23745a = cVar;
    }

    @Override // com.google.gson.r
    public <T> TypeAdapter<T> a(Gson gson, com.google.gson.reflect.a<T> aVar) {
        ed.b bVar = (ed.b) aVar.c().getAnnotation(ed.b.class);
        if (bVar == null) {
            return null;
        }
        return (TypeAdapter<T>) b(this.f23745a, gson, aVar, bVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public TypeAdapter<?> b(c cVar, Gson gson, com.google.gson.reflect.a<?> aVar, ed.b bVar) {
        TypeAdapter<?> treeTypeAdapter;
        Object construct = cVar.a(com.google.gson.reflect.a.a(bVar.value())).construct();
        if (construct instanceof TypeAdapter) {
            treeTypeAdapter = (TypeAdapter) construct;
        } else if (construct instanceof r) {
            treeTypeAdapter = ((r) construct).a(gson, aVar);
        } else {
            boolean z10 = construct instanceof o;
            if (!z10 && !(construct instanceof g)) {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + construct.getClass().getName() + " as a @JsonAdapter for " + aVar.toString() + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
            treeTypeAdapter = new TreeTypeAdapter<>(z10 ? (o) construct : null, construct instanceof g ? (g) construct : null, gson, aVar, null);
        }
        return (treeTypeAdapter == null || !bVar.nullSafe()) ? treeTypeAdapter : treeTypeAdapter.a();
    }
}
