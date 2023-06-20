package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.f;
import com.google.gson.g;
import com.google.gson.h;
import com.google.gson.internal.k;
import com.google.gson.l;
import com.google.gson.n;
import com.google.gson.o;
import com.google.gson.r;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Type;

/* loaded from: classes3.dex */
public final class TreeTypeAdapter<T> extends TypeAdapter<T> {

    /* renamed from: a  reason: collision with root package name */
    private final o<T> f23775a;

    /* renamed from: b  reason: collision with root package name */
    private final g<T> f23776b;

    /* renamed from: c  reason: collision with root package name */
    final Gson f23777c;

    /* renamed from: d  reason: collision with root package name */
    private final com.google.gson.reflect.a<T> f23778d;

    /* renamed from: e  reason: collision with root package name */
    private final r f23779e;

    /* renamed from: f  reason: collision with root package name */
    private final TreeTypeAdapter<T>.b f23780f = new b();

    /* renamed from: g  reason: collision with root package name */
    private TypeAdapter<T> f23781g;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static final class SingleTypeFactory implements r {

        /* renamed from: a  reason: collision with root package name */
        private final com.google.gson.reflect.a<?> f23782a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f23783b;

        /* renamed from: c  reason: collision with root package name */
        private final Class<?> f23784c;

        /* renamed from: d  reason: collision with root package name */
        private final o<?> f23785d;

        /* renamed from: e  reason: collision with root package name */
        private final g<?> f23786e;

        SingleTypeFactory(Object obj, com.google.gson.reflect.a<?> aVar, boolean z10, Class<?> cls) {
            o<?> oVar = obj instanceof o ? (o) obj : null;
            this.f23785d = oVar;
            g<?> gVar = obj instanceof g ? (g) obj : null;
            this.f23786e = gVar;
            com.google.gson.internal.a.a((oVar == null && gVar == null) ? false : true);
            this.f23782a = aVar;
            this.f23783b = z10;
            this.f23784c = cls;
        }

        @Override // com.google.gson.r
        public <T> TypeAdapter<T> a(Gson gson, com.google.gson.reflect.a<T> aVar) {
            boolean isAssignableFrom;
            com.google.gson.reflect.a<?> aVar2 = this.f23782a;
            if (aVar2 != null) {
                isAssignableFrom = aVar2.equals(aVar) || (this.f23783b && this.f23782a.e() == aVar.c());
            } else {
                isAssignableFrom = this.f23784c.isAssignableFrom(aVar.c());
            }
            if (isAssignableFrom) {
                return new TreeTypeAdapter(this.f23785d, this.f23786e, gson, aVar, this);
            }
            return null;
        }
    }

    /* loaded from: classes3.dex */
    private final class b implements n, f {
        private b() {
        }

        @Override // com.google.gson.f
        public <R> R a(h hVar, Type type) throws l {
            return (R) TreeTypeAdapter.this.f23777c.fromJson(hVar, type);
        }

        @Override // com.google.gson.n
        public h b(Object obj) {
            return TreeTypeAdapter.this.f23777c.toJsonTree(obj);
        }
    }

    public TreeTypeAdapter(o<T> oVar, g<T> gVar, Gson gson, com.google.gson.reflect.a<T> aVar, r rVar) {
        this.f23775a = oVar;
        this.f23776b = gVar;
        this.f23777c = gson;
        this.f23778d = aVar;
        this.f23779e = rVar;
    }

    private TypeAdapter<T> e() {
        TypeAdapter<T> typeAdapter = this.f23781g;
        if (typeAdapter != null) {
            return typeAdapter;
        }
        TypeAdapter<T> delegateAdapter = this.f23777c.getDelegateAdapter(this.f23779e, this.f23778d);
        this.f23781g = delegateAdapter;
        return delegateAdapter;
    }

    public static r f(com.google.gson.reflect.a<?> aVar, Object obj) {
        return new SingleTypeFactory(obj, aVar, aVar.e() == aVar.c(), null);
    }

    public static r g(Class<?> cls, Object obj) {
        return new SingleTypeFactory(obj, null, false, cls);
    }

    @Override // com.google.gson.TypeAdapter
    public T b(JsonReader jsonReader) throws IOException {
        if (this.f23776b == null) {
            return e().b(jsonReader);
        }
        h a10 = k.a(jsonReader);
        if (a10.j()) {
            return null;
        }
        return this.f23776b.deserialize(a10, this.f23778d.e(), this.f23780f);
    }

    @Override // com.google.gson.TypeAdapter
    public void d(JsonWriter jsonWriter, T t10) throws IOException {
        o<T> oVar = this.f23775a;
        if (oVar == null) {
            e().d(jsonWriter, t10);
        } else if (t10 == null) {
            jsonWriter.nullValue();
        } else {
            k.b(oVar.serialize(t10, this.f23778d.e(), this.f23780f), jsonWriter);
        }
    }
}
