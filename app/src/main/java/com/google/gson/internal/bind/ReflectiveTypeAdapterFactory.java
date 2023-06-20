package com.google.gson.internal.bind;

import com.google.gson.FieldNamingStrategy;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.c;
import com.google.gson.internal.h;
import com.google.gson.internal.j;
import com.google.gson.p;
import com.google.gson.r;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class ReflectiveTypeAdapterFactory implements r {

    /* renamed from: a  reason: collision with root package name */
    private final c f23755a;

    /* renamed from: b  reason: collision with root package name */
    private final FieldNamingStrategy f23756b;

    /* renamed from: c  reason: collision with root package name */
    private final Excluder f23757c;

    /* renamed from: d  reason: collision with root package name */
    private final JsonAdapterAnnotationTypeAdapterFactory f23758d;

    /* renamed from: e  reason: collision with root package name */
    private final gd.b f23759e = gd.b.a();

    /* loaded from: classes3.dex */
    public static final class Adapter<T> extends TypeAdapter<T> {

        /* renamed from: a  reason: collision with root package name */
        private final h<T> f23760a;

        /* renamed from: b  reason: collision with root package name */
        private final Map<String, b> f23761b;

        Adapter(h<T> hVar, Map<String, b> map) {
            this.f23760a = hVar;
            this.f23761b = map;
        }

        @Override // com.google.gson.TypeAdapter
        public T b(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            T construct = this.f23760a.construct();
            try {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    b bVar = this.f23761b.get(jsonReader.nextName());
                    if (bVar != null && bVar.f23770c) {
                        bVar.a(jsonReader, construct);
                    }
                    jsonReader.skipValue();
                }
                jsonReader.endObject();
                return construct;
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            } catch (IllegalStateException e11) {
                throw new p(e11);
            }
        }

        @Override // com.google.gson.TypeAdapter
        public void d(JsonWriter jsonWriter, T t10) throws IOException {
            if (t10 == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            try {
                for (b bVar : this.f23761b.values()) {
                    if (bVar.c(t10)) {
                        jsonWriter.name(bVar.f23768a);
                        bVar.b(jsonWriter, t10);
                    }
                }
                jsonWriter.endObject();
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a extends b {

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Field f23762d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f23763e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ TypeAdapter f23764f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ Gson f23765g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ com.google.gson.reflect.a f23766h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ boolean f23767i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory, String str, boolean z10, boolean z11, Field field, boolean z12, TypeAdapter typeAdapter, Gson gson, com.google.gson.reflect.a aVar, boolean z13) {
            super(str, z10, z11);
            this.f23762d = field;
            this.f23763e = z12;
            this.f23764f = typeAdapter;
            this.f23765g = gson;
            this.f23766h = aVar;
            this.f23767i = z13;
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.b
        void a(JsonReader jsonReader, Object obj) throws IOException, IllegalAccessException {
            Object b10 = this.f23764f.b(jsonReader);
            if (b10 == null && this.f23767i) {
                return;
            }
            this.f23762d.set(obj, b10);
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.b
        void b(JsonWriter jsonWriter, Object obj) throws IOException, IllegalAccessException {
            (this.f23763e ? this.f23764f : new TypeAdapterRuntimeTypeWrapper(this.f23765g, this.f23764f, this.f23766h.e())).d(jsonWriter, this.f23762d.get(obj));
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.b
        public boolean c(Object obj) throws IOException, IllegalAccessException {
            return this.f23769b && this.f23762d.get(obj) != obj;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static abstract class b {

        /* renamed from: a  reason: collision with root package name */
        final String f23768a;

        /* renamed from: b  reason: collision with root package name */
        final boolean f23769b;

        /* renamed from: c  reason: collision with root package name */
        final boolean f23770c;

        protected b(String str, boolean z10, boolean z11) {
            this.f23768a = str;
            this.f23769b = z10;
            this.f23770c = z11;
        }

        abstract void a(JsonReader jsonReader, Object obj) throws IOException, IllegalAccessException;

        abstract void b(JsonWriter jsonWriter, Object obj) throws IOException, IllegalAccessException;

        abstract boolean c(Object obj) throws IOException, IllegalAccessException;
    }

    public ReflectiveTypeAdapterFactory(c cVar, FieldNamingStrategy fieldNamingStrategy, Excluder excluder, JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory) {
        this.f23755a = cVar;
        this.f23756b = fieldNamingStrategy;
        this.f23757c = excluder;
        this.f23758d = jsonAdapterAnnotationTypeAdapterFactory;
    }

    private b b(Gson gson, Field field, String str, com.google.gson.reflect.a<?> aVar, boolean z10, boolean z11) {
        boolean b10 = j.b(aVar.c());
        ed.b bVar = (ed.b) field.getAnnotation(ed.b.class);
        TypeAdapter<?> b11 = bVar != null ? this.f23758d.b(this.f23755a, gson, aVar, bVar) : null;
        boolean z12 = b11 != null;
        if (b11 == null) {
            b11 = gson.getAdapter(aVar);
        }
        return new a(this, str, z10, z11, field, z12, b11, gson, aVar, b10);
    }

    static boolean d(Field field, boolean z10, Excluder excluder) {
        return (excluder.d(field.getType(), z10) || excluder.g(field, z10)) ? false : true;
    }

    private Map<String, b> e(Gson gson, com.google.gson.reflect.a<?> aVar, Class<?> cls) {
        b bVar;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (cls.isInterface()) {
            return linkedHashMap;
        }
        Type e10 = aVar.e();
        com.google.gson.reflect.a<?> aVar2 = aVar;
        Class<?> cls2 = cls;
        while (cls2 != Object.class) {
            Field[] declaredFields = cls2.getDeclaredFields();
            int length = declaredFields.length;
            boolean z10 = false;
            int i10 = 0;
            while (i10 < length) {
                Field field = declaredFields[i10];
                boolean c10 = c(field, true);
                boolean c11 = c(field, z10);
                if (c10 || c11) {
                    this.f23759e.b(field);
                    Type p10 = com.google.gson.internal.b.p(aVar2.e(), cls2, field.getGenericType());
                    List<String> f10 = f(field);
                    int size = f10.size();
                    b bVar2 = null;
                    int i11 = 0;
                    while (i11 < size) {
                        String str = f10.get(i11);
                        boolean z11 = i11 != 0 ? false : c10;
                        int i12 = i11;
                        b bVar3 = bVar2;
                        int i13 = size;
                        List<String> list = f10;
                        Field field2 = field;
                        bVar2 = bVar3 == null ? (b) linkedHashMap.put(str, b(gson, field, str, com.google.gson.reflect.a.b(p10), z11, c11)) : bVar3;
                        i11 = i12 + 1;
                        c10 = z11;
                        f10 = list;
                        size = i13;
                        field = field2;
                    }
                    if (bVar2 != null) {
                        throw new IllegalArgumentException(e10 + " declares multiple JSON fields named " + bVar.f23768a);
                    }
                }
                i10++;
                z10 = false;
            }
            aVar2 = com.google.gson.reflect.a.b(com.google.gson.internal.b.p(aVar2.e(), cls2, cls2.getGenericSuperclass()));
            cls2 = aVar2.c();
        }
        return linkedHashMap;
    }

    private List<String> f(Field field) {
        ed.c cVar = (ed.c) field.getAnnotation(ed.c.class);
        if (cVar == null) {
            return Collections.singletonList(this.f23756b.translateName(field));
        }
        String value = cVar.value();
        String[] alternate = cVar.alternate();
        if (alternate.length == 0) {
            return Collections.singletonList(value);
        }
        ArrayList arrayList = new ArrayList(alternate.length + 1);
        arrayList.add(value);
        for (String str : alternate) {
            arrayList.add(str);
        }
        return arrayList;
    }

    @Override // com.google.gson.r
    public <T> TypeAdapter<T> a(Gson gson, com.google.gson.reflect.a<T> aVar) {
        Class<? super T> c10 = aVar.c();
        if (Object.class.isAssignableFrom(c10)) {
            return new Adapter(this.f23755a.a(aVar), e(gson, aVar, c10));
        }
        return null;
    }

    public boolean c(Field field, boolean z10) {
        return d(field, z10, this.f23757c);
    }
}
