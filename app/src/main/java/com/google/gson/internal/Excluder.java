package com.google.gson.internal;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.r;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class Excluder implements r, Cloneable {

    /* renamed from: g  reason: collision with root package name */
    public static final Excluder f23717g = new Excluder();

    /* renamed from: d  reason: collision with root package name */
    private boolean f23721d;

    /* renamed from: a  reason: collision with root package name */
    private double f23718a = -1.0d;

    /* renamed from: b  reason: collision with root package name */
    private int f23719b = 136;

    /* renamed from: c  reason: collision with root package name */
    private boolean f23720c = true;

    /* renamed from: e  reason: collision with root package name */
    private List<com.google.gson.a> f23722e = Collections.emptyList();

    /* renamed from: f  reason: collision with root package name */
    private List<com.google.gson.a> f23723f = Collections.emptyList();

    private boolean e(Class<?> cls) {
        if (this.f23718a == -1.0d || p((ed.d) cls.getAnnotation(ed.d.class), (ed.e) cls.getAnnotation(ed.e.class))) {
            return (!this.f23720c && k(cls)) || j(cls);
        }
        return true;
    }

    private boolean f(Class<?> cls, boolean z10) {
        for (com.google.gson.a aVar : z10 ? this.f23722e : this.f23723f) {
            if (aVar.b(cls)) {
                return true;
            }
        }
        return false;
    }

    private boolean j(Class<?> cls) {
        return !Enum.class.isAssignableFrom(cls) && (cls.isAnonymousClass() || cls.isLocalClass());
    }

    private boolean k(Class<?> cls) {
        return cls.isMemberClass() && !m(cls);
    }

    private boolean m(Class<?> cls) {
        return (cls.getModifiers() & 8) != 0;
    }

    private boolean n(ed.d dVar) {
        return dVar == null || dVar.value() <= this.f23718a;
    }

    private boolean o(ed.e eVar) {
        return eVar == null || eVar.value() > this.f23718a;
    }

    private boolean p(ed.d dVar, ed.e eVar) {
        return n(dVar) && o(eVar);
    }

    @Override // com.google.gson.r
    public <T> TypeAdapter<T> a(final Gson gson, final com.google.gson.reflect.a<T> aVar) {
        Class<? super T> c10 = aVar.c();
        boolean e10 = e(c10);
        final boolean z10 = e10 || f(c10, true);
        final boolean z11 = e10 || f(c10, false);
        if (z10 || z11) {
            return new TypeAdapter<T>() { // from class: com.google.gson.internal.Excluder.1

                /* renamed from: a  reason: collision with root package name */
                private TypeAdapter<T> f23724a;

                private TypeAdapter<T> e() {
                    TypeAdapter<T> typeAdapter = this.f23724a;
                    if (typeAdapter != null) {
                        return typeAdapter;
                    }
                    TypeAdapter<T> delegateAdapter = gson.getDelegateAdapter(Excluder.this, aVar);
                    this.f23724a = delegateAdapter;
                    return delegateAdapter;
                }

                @Override // com.google.gson.TypeAdapter
                public T b(JsonReader jsonReader) throws IOException {
                    if (z11) {
                        jsonReader.skipValue();
                        return null;
                    }
                    return e().b(jsonReader);
                }

                @Override // com.google.gson.TypeAdapter
                public void d(JsonWriter jsonWriter, T t10) throws IOException {
                    if (z10) {
                        jsonWriter.nullValue();
                    } else {
                        e().d(jsonWriter, t10);
                    }
                }
            };
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public Excluder clone() {
        try {
            return (Excluder) super.clone();
        } catch (CloneNotSupportedException e10) {
            throw new AssertionError(e10);
        }
    }

    public Excluder c() {
        Excluder clone = clone();
        clone.f23720c = false;
        return clone;
    }

    public boolean d(Class<?> cls, boolean z10) {
        return e(cls) || f(cls, z10);
    }

    public boolean g(Field field, boolean z10) {
        ed.a aVar;
        if ((this.f23719b & field.getModifiers()) != 0) {
            return true;
        }
        if ((this.f23718a == -1.0d || p((ed.d) field.getAnnotation(ed.d.class), (ed.e) field.getAnnotation(ed.e.class))) && !field.isSynthetic()) {
            if (!this.f23721d || ((aVar = (ed.a) field.getAnnotation(ed.a.class)) != null && (!z10 ? !aVar.deserialize() : !aVar.serialize()))) {
                if ((this.f23720c || !k(field.getType())) && !j(field.getType())) {
                    List<com.google.gson.a> list = z10 ? this.f23722e : this.f23723f;
                    if (list.isEmpty()) {
                        return false;
                    }
                    com.google.gson.b bVar = new com.google.gson.b(field);
                    for (com.google.gson.a aVar2 : list) {
                        if (aVar2.a(bVar)) {
                            return true;
                        }
                    }
                    return false;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    public Excluder i() {
        Excluder clone = clone();
        clone.f23721d = true;
        return clone;
    }

    public Excluder q(com.google.gson.a aVar, boolean z10, boolean z11) {
        Excluder clone = clone();
        if (z10) {
            ArrayList arrayList = new ArrayList(this.f23722e);
            clone.f23722e = arrayList;
            arrayList.add(aVar);
        }
        if (z11) {
            ArrayList arrayList2 = new ArrayList(this.f23723f);
            clone.f23723f = arrayList2;
            arrayList2.add(aVar);
        }
        return clone;
    }

    public Excluder r(int... iArr) {
        Excluder clone = clone();
        clone.f23719b = 0;
        for (int i10 : iArr) {
            clone.f23719b = i10 | clone.f23719b;
        }
        return clone;
    }

    public Excluder s(double d10) {
        Excluder clone = clone();
        clone.f23718a = d10;
        return clone;
    }
}
