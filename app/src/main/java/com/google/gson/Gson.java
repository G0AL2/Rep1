package com.google.gson;

import com.google.gson.internal.Excluder;
import com.google.gson.internal.bind.ArrayTypeAdapter;
import com.google.gson.internal.bind.CollectionTypeAdapterFactory;
import com.google.gson.internal.bind.DateTypeAdapter;
import com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory;
import com.google.gson.internal.bind.MapTypeAdapterFactory;
import com.google.gson.internal.bind.ObjectTypeAdapter;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.google.gson.internal.bind.SqlDateTypeAdapter;
import com.google.gson.internal.bind.TimeTypeAdapter;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.google.gson.stream.MalformedJsonException;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* loaded from: classes3.dex */
public final class Gson {
    static final boolean DEFAULT_COMPLEX_MAP_KEYS = false;
    static final boolean DEFAULT_ESCAPE_HTML = true;
    static final boolean DEFAULT_JSON_NON_EXECUTABLE = false;
    static final boolean DEFAULT_LENIENT = false;
    static final boolean DEFAULT_PRETTY_PRINT = false;
    static final boolean DEFAULT_SERIALIZE_NULLS = false;
    static final boolean DEFAULT_SPECIALIZE_FLOAT_VALUES = false;
    private static final String JSON_NON_EXECUTABLE_PREFIX = ")]}'\n";
    private static final com.google.gson.reflect.a<?> NULL_KEY_SURROGATE = com.google.gson.reflect.a.a(Object.class);
    final List<r> builderFactories;
    final List<r> builderHierarchyFactories;
    private final ThreadLocal<Map<com.google.gson.reflect.a<?>, FutureTypeAdapter<?>>> calls;
    final boolean complexMapKeySerialization;
    private final com.google.gson.internal.c constructorConstructor;
    final String datePattern;
    final int dateStyle;
    final Excluder excluder;
    final List<r> factories;
    final FieldNamingStrategy fieldNamingStrategy;
    final boolean generateNonExecutableJson;
    final boolean htmlSafe;
    final Map<Type, d<?>> instanceCreators;
    private final JsonAdapterAnnotationTypeAdapterFactory jsonAdapterFactory;
    final boolean lenient;
    final q longSerializationPolicy;
    final boolean prettyPrinting;
    final boolean serializeNulls;
    final boolean serializeSpecialFloatingPointValues;
    final int timeStyle;
    private final Map<com.google.gson.reflect.a<?>, TypeAdapter<?>> typeTokenCache;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class FutureTypeAdapter<T> extends TypeAdapter<T> {

        /* renamed from: a  reason: collision with root package name */
        private TypeAdapter<T> f23707a;

        FutureTypeAdapter() {
        }

        @Override // com.google.gson.TypeAdapter
        public T b(JsonReader jsonReader) throws IOException {
            TypeAdapter<T> typeAdapter = this.f23707a;
            if (typeAdapter != null) {
                return typeAdapter.b(jsonReader);
            }
            throw new IllegalStateException();
        }

        @Override // com.google.gson.TypeAdapter
        public void d(JsonWriter jsonWriter, T t10) throws IOException {
            TypeAdapter<T> typeAdapter = this.f23707a;
            if (typeAdapter != null) {
                typeAdapter.d(jsonWriter, t10);
                return;
            }
            throw new IllegalStateException();
        }

        public void e(TypeAdapter<T> typeAdapter) {
            if (this.f23707a == null) {
                this.f23707a = typeAdapter;
                return;
            }
            throw new AssertionError();
        }
    }

    public Gson() {
        this(Excluder.f23717g, c.f23709a, Collections.emptyMap(), false, false, false, true, false, false, false, q.f23895a, null, 2, 2, Collections.emptyList(), Collections.emptyList(), Collections.emptyList());
    }

    private static void assertFullConsumption(Object obj, JsonReader jsonReader) {
        if (obj != null) {
            try {
                if (jsonReader.peek() == JsonToken.END_DOCUMENT) {
                    return;
                }
                throw new i("JSON document was not fully consumed.");
            } catch (MalformedJsonException e10) {
                throw new p(e10);
            } catch (IOException e11) {
                throw new i(e11);
            }
        }
    }

    private static TypeAdapter<AtomicLong> atomicLongAdapter(final TypeAdapter<Number> typeAdapter) {
        return new TypeAdapter<AtomicLong>() { // from class: com.google.gson.Gson.4
            @Override // com.google.gson.TypeAdapter
            /* renamed from: e */
            public AtomicLong b(JsonReader jsonReader) throws IOException {
                return new AtomicLong(((Number) TypeAdapter.this.b(jsonReader)).longValue());
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: f */
            public void d(JsonWriter jsonWriter, AtomicLong atomicLong) throws IOException {
                TypeAdapter.this.d(jsonWriter, Long.valueOf(atomicLong.get()));
            }
        }.a();
    }

    private static TypeAdapter<AtomicLongArray> atomicLongArrayAdapter(final TypeAdapter<Number> typeAdapter) {
        return new TypeAdapter<AtomicLongArray>() { // from class: com.google.gson.Gson.5
            @Override // com.google.gson.TypeAdapter
            /* renamed from: e */
            public AtomicLongArray b(JsonReader jsonReader) throws IOException {
                ArrayList arrayList = new ArrayList();
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    arrayList.add(Long.valueOf(((Number) TypeAdapter.this.b(jsonReader)).longValue()));
                }
                jsonReader.endArray();
                int size = arrayList.size();
                AtomicLongArray atomicLongArray = new AtomicLongArray(size);
                for (int i10 = 0; i10 < size; i10++) {
                    atomicLongArray.set(i10, ((Long) arrayList.get(i10)).longValue());
                }
                return atomicLongArray;
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: f */
            public void d(JsonWriter jsonWriter, AtomicLongArray atomicLongArray) throws IOException {
                jsonWriter.beginArray();
                int length = atomicLongArray.length();
                for (int i10 = 0; i10 < length; i10++) {
                    TypeAdapter.this.d(jsonWriter, Long.valueOf(atomicLongArray.get(i10)));
                }
                jsonWriter.endArray();
            }
        }.a();
    }

    static void checkValidFloatingPoint(double d10) {
        if (Double.isNaN(d10) || Double.isInfinite(d10)) {
            throw new IllegalArgumentException(d10 + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    private TypeAdapter<Number> doubleAdapter(boolean z10) {
        if (z10) {
            return TypeAdapters.f23812v;
        }
        return new TypeAdapter<Number>(this) { // from class: com.google.gson.Gson.1
            @Override // com.google.gson.TypeAdapter
            /* renamed from: e */
            public Double b(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                return Double.valueOf(jsonReader.nextDouble());
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: f */
            public void d(JsonWriter jsonWriter, Number number) throws IOException {
                if (number == null) {
                    jsonWriter.nullValue();
                    return;
                }
                Gson.checkValidFloatingPoint(number.doubleValue());
                jsonWriter.value(number);
            }
        };
    }

    private TypeAdapter<Number> floatAdapter(boolean z10) {
        if (z10) {
            return TypeAdapters.f23811u;
        }
        return new TypeAdapter<Number>(this) { // from class: com.google.gson.Gson.2
            @Override // com.google.gson.TypeAdapter
            /* renamed from: e */
            public Float b(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                return Float.valueOf((float) jsonReader.nextDouble());
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: f */
            public void d(JsonWriter jsonWriter, Number number) throws IOException {
                if (number == null) {
                    jsonWriter.nullValue();
                    return;
                }
                Gson.checkValidFloatingPoint(number.floatValue());
                jsonWriter.value(number);
            }
        };
    }

    private static TypeAdapter<Number> longAdapter(q qVar) {
        if (qVar == q.f23895a) {
            return TypeAdapters.f23810t;
        }
        return new TypeAdapter<Number>() { // from class: com.google.gson.Gson.3
            @Override // com.google.gson.TypeAdapter
            /* renamed from: e */
            public Number b(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                return Long.valueOf(jsonReader.nextLong());
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: f */
            public void d(JsonWriter jsonWriter, Number number) throws IOException {
                if (number == null) {
                    jsonWriter.nullValue();
                } else {
                    jsonWriter.value(number.toString());
                }
            }
        };
    }

    public Excluder excluder() {
        return this.excluder;
    }

    public FieldNamingStrategy fieldNamingStrategy() {
        return this.fieldNamingStrategy;
    }

    public <T> T fromJson(String str, Class<T> cls) throws p {
        return (T) com.google.gson.internal.j.c(cls).cast(fromJson(str, (Type) cls));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> TypeAdapter<T> getAdapter(com.google.gson.reflect.a<T> aVar) {
        TypeAdapter<T> typeAdapter = (TypeAdapter<T>) this.typeTokenCache.get(aVar == null ? NULL_KEY_SURROGATE : aVar);
        if (typeAdapter != null) {
            return typeAdapter;
        }
        Map<com.google.gson.reflect.a<?>, FutureTypeAdapter<?>> map = this.calls.get();
        boolean z10 = false;
        if (map == null) {
            map = new HashMap<>();
            this.calls.set(map);
            z10 = true;
        }
        FutureTypeAdapter<?> futureTypeAdapter = map.get(aVar);
        if (futureTypeAdapter != null) {
            return futureTypeAdapter;
        }
        try {
            FutureTypeAdapter<?> futureTypeAdapter2 = new FutureTypeAdapter<>();
            map.put(aVar, futureTypeAdapter2);
            for (r rVar : this.factories) {
                TypeAdapter typeAdapter2 = (TypeAdapter<T>) rVar.a(this, aVar);
                if (typeAdapter2 != null) {
                    futureTypeAdapter2.e(typeAdapter2);
                    this.typeTokenCache.put(aVar, typeAdapter2);
                    return typeAdapter2;
                }
            }
            throw new IllegalArgumentException("GSON (2.8.5) cannot handle " + aVar);
        } finally {
            map.remove(aVar);
            if (z10) {
                this.calls.remove();
            }
        }
    }

    public <T> TypeAdapter<T> getDelegateAdapter(r rVar, com.google.gson.reflect.a<T> aVar) {
        if (!this.factories.contains(rVar)) {
            rVar = this.jsonAdapterFactory;
        }
        boolean z10 = false;
        for (r rVar2 : this.factories) {
            if (z10) {
                TypeAdapter<T> a10 = rVar2.a(this, aVar);
                if (a10 != null) {
                    return a10;
                }
            } else if (rVar2 == rVar) {
                z10 = true;
            }
        }
        throw new IllegalArgumentException("GSON cannot serialize " + aVar);
    }

    public boolean htmlSafe() {
        return this.htmlSafe;
    }

    public GsonBuilder newBuilder() {
        return new GsonBuilder(this);
    }

    public JsonReader newJsonReader(Reader reader) {
        JsonReader jsonReader = new JsonReader(reader);
        jsonReader.setLenient(this.lenient);
        return jsonReader;
    }

    public JsonWriter newJsonWriter(Writer writer) throws IOException {
        if (this.generateNonExecutableJson) {
            writer.write(JSON_NON_EXECUTABLE_PREFIX);
        }
        JsonWriter jsonWriter = new JsonWriter(writer);
        if (this.prettyPrinting) {
            jsonWriter.setIndent("  ");
        }
        jsonWriter.setSerializeNulls(this.serializeNulls);
        return jsonWriter;
    }

    public boolean serializeNulls() {
        return this.serializeNulls;
    }

    public String toJson(Object obj) {
        if (obj == null) {
            return toJson((h) j.f23891a);
        }
        return toJson(obj, obj.getClass());
    }

    public h toJsonTree(Object obj) {
        if (obj == null) {
            return j.f23891a;
        }
        return toJsonTree(obj, obj.getClass());
    }

    public String toString() {
        return "{serializeNulls:" + this.serializeNulls + ",factories:" + this.factories + ",instanceCreators:" + this.constructorConstructor + "}";
    }

    public <T> T fromJson(String str, Type type) throws p {
        if (str == null) {
            return null;
        }
        return (T) fromJson(new StringReader(str), type);
    }

    public String toJson(Object obj, Type type) {
        StringWriter stringWriter = new StringWriter();
        toJson(obj, type, stringWriter);
        return stringWriter.toString();
    }

    public h toJsonTree(Object obj, Type type) {
        com.google.gson.internal.bind.b bVar = new com.google.gson.internal.bind.b();
        toJson(obj, type, bVar);
        return bVar.a();
    }

    public <T> T fromJson(Reader reader, Class<T> cls) throws p, i {
        JsonReader newJsonReader = newJsonReader(reader);
        Object fromJson = fromJson(newJsonReader, cls);
        assertFullConsumption(fromJson, newJsonReader);
        return (T) com.google.gson.internal.j.c(cls).cast(fromJson);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Gson(Excluder excluder, FieldNamingStrategy fieldNamingStrategy, Map<Type, d<?>> map, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, q qVar, String str, int i10, int i11, List<r> list, List<r> list2, List<r> list3) {
        this.calls = new ThreadLocal<>();
        this.typeTokenCache = new ConcurrentHashMap();
        this.excluder = excluder;
        this.fieldNamingStrategy = fieldNamingStrategy;
        this.instanceCreators = map;
        com.google.gson.internal.c cVar = new com.google.gson.internal.c(map);
        this.constructorConstructor = cVar;
        this.serializeNulls = z10;
        this.complexMapKeySerialization = z11;
        this.generateNonExecutableJson = z12;
        this.htmlSafe = z13;
        this.prettyPrinting = z14;
        this.lenient = z15;
        this.serializeSpecialFloatingPointValues = z16;
        this.longSerializationPolicy = qVar;
        this.datePattern = str;
        this.dateStyle = i10;
        this.timeStyle = i11;
        this.builderFactories = list;
        this.builderHierarchyFactories = list2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(TypeAdapters.Y);
        arrayList.add(ObjectTypeAdapter.f23752b);
        arrayList.add(excluder);
        arrayList.addAll(list3);
        arrayList.add(TypeAdapters.D);
        arrayList.add(TypeAdapters.f23803m);
        arrayList.add(TypeAdapters.f23797g);
        arrayList.add(TypeAdapters.f23799i);
        arrayList.add(TypeAdapters.f23801k);
        TypeAdapter<Number> longAdapter = longAdapter(qVar);
        arrayList.add(TypeAdapters.c(Long.TYPE, Long.class, longAdapter));
        arrayList.add(TypeAdapters.c(Double.TYPE, Double.class, doubleAdapter(z16)));
        arrayList.add(TypeAdapters.c(Float.TYPE, Float.class, floatAdapter(z16)));
        arrayList.add(TypeAdapters.f23814x);
        arrayList.add(TypeAdapters.f23805o);
        arrayList.add(TypeAdapters.f23807q);
        arrayList.add(TypeAdapters.b(AtomicLong.class, atomicLongAdapter(longAdapter)));
        arrayList.add(TypeAdapters.b(AtomicLongArray.class, atomicLongArrayAdapter(longAdapter)));
        arrayList.add(TypeAdapters.f23809s);
        arrayList.add(TypeAdapters.f23816z);
        arrayList.add(TypeAdapters.F);
        arrayList.add(TypeAdapters.H);
        arrayList.add(TypeAdapters.b(BigDecimal.class, TypeAdapters.B));
        arrayList.add(TypeAdapters.b(BigInteger.class, TypeAdapters.C));
        arrayList.add(TypeAdapters.J);
        arrayList.add(TypeAdapters.L);
        arrayList.add(TypeAdapters.P);
        arrayList.add(TypeAdapters.R);
        arrayList.add(TypeAdapters.W);
        arrayList.add(TypeAdapters.N);
        arrayList.add(TypeAdapters.f23794d);
        arrayList.add(DateTypeAdapter.f23743b);
        arrayList.add(TypeAdapters.U);
        arrayList.add(TimeTypeAdapter.f23773b);
        arrayList.add(SqlDateTypeAdapter.f23771b);
        arrayList.add(TypeAdapters.S);
        arrayList.add(ArrayTypeAdapter.f23737c);
        arrayList.add(TypeAdapters.f23792b);
        arrayList.add(new CollectionTypeAdapterFactory(cVar));
        arrayList.add(new MapTypeAdapterFactory(cVar, z11));
        JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory = new JsonAdapterAnnotationTypeAdapterFactory(cVar);
        this.jsonAdapterFactory = jsonAdapterAnnotationTypeAdapterFactory;
        arrayList.add(jsonAdapterAnnotationTypeAdapterFactory);
        arrayList.add(TypeAdapters.Z);
        arrayList.add(new ReflectiveTypeAdapterFactory(cVar, fieldNamingStrategy, excluder, jsonAdapterAnnotationTypeAdapterFactory));
        this.factories = Collections.unmodifiableList(arrayList);
    }

    public void toJson(Object obj, Appendable appendable) throws i {
        if (obj != null) {
            toJson(obj, obj.getClass(), appendable);
        } else {
            toJson((h) j.f23891a, appendable);
        }
    }

    public void toJson(Object obj, Type type, Appendable appendable) throws i {
        try {
            toJson(obj, type, newJsonWriter(com.google.gson.internal.k.c(appendable)));
        } catch (IOException e10) {
            throw new i(e10);
        }
    }

    public <T> T fromJson(Reader reader, Type type) throws i, p {
        JsonReader newJsonReader = newJsonReader(reader);
        T t10 = (T) fromJson(newJsonReader, type);
        assertFullConsumption(t10, newJsonReader);
        return t10;
    }

    public void toJson(Object obj, Type type, JsonWriter jsonWriter) throws i {
        TypeAdapter adapter = getAdapter(com.google.gson.reflect.a.b(type));
        boolean isLenient = jsonWriter.isLenient();
        jsonWriter.setLenient(true);
        boolean isHtmlSafe = jsonWriter.isHtmlSafe();
        jsonWriter.setHtmlSafe(this.htmlSafe);
        boolean serializeNulls = jsonWriter.getSerializeNulls();
        jsonWriter.setSerializeNulls(this.serializeNulls);
        try {
            try {
                adapter.d(jsonWriter, obj);
            } catch (IOException e10) {
                throw new i(e10);
            } catch (AssertionError e11) {
                throw new AssertionError("AssertionError (GSON 2.8.5): " + e11.getMessage(), e11);
            }
        } finally {
            jsonWriter.setLenient(isLenient);
            jsonWriter.setHtmlSafe(isHtmlSafe);
            jsonWriter.setSerializeNulls(serializeNulls);
        }
    }

    public <T> T fromJson(JsonReader jsonReader, Type type) throws i, p {
        boolean isLenient = jsonReader.isLenient();
        boolean z10 = true;
        jsonReader.setLenient(true);
        try {
            try {
                try {
                    jsonReader.peek();
                    z10 = false;
                    T b10 = getAdapter(com.google.gson.reflect.a.b(type)).b(jsonReader);
                    jsonReader.setLenient(isLenient);
                    return b10;
                } catch (EOFException e10) {
                    if (z10) {
                        jsonReader.setLenient(isLenient);
                        return null;
                    }
                    throw new p(e10);
                } catch (AssertionError e11) {
                    throw new AssertionError("AssertionError (GSON 2.8.5): " + e11.getMessage(), e11);
                }
            } catch (IOException e12) {
                throw new p(e12);
            } catch (IllegalStateException e13) {
                throw new p(e13);
            }
        } catch (Throwable th) {
            jsonReader.setLenient(isLenient);
            throw th;
        }
    }

    public <T> TypeAdapter<T> getAdapter(Class<T> cls) {
        return getAdapter(com.google.gson.reflect.a.a(cls));
    }

    public <T> T fromJson(h hVar, Class<T> cls) throws p {
        return (T) com.google.gson.internal.j.c(cls).cast(fromJson(hVar, (Type) cls));
    }

    public <T> T fromJson(h hVar, Type type) throws p {
        if (hVar == null) {
            return null;
        }
        return (T) fromJson(new com.google.gson.internal.bind.a(hVar), type);
    }

    public String toJson(h hVar) {
        StringWriter stringWriter = new StringWriter();
        toJson(hVar, (Appendable) stringWriter);
        return stringWriter.toString();
    }

    public void toJson(h hVar, Appendable appendable) throws i {
        try {
            toJson(hVar, newJsonWriter(com.google.gson.internal.k.c(appendable)));
        } catch (IOException e10) {
            throw new i(e10);
        }
    }

    public void toJson(h hVar, JsonWriter jsonWriter) throws i {
        boolean isLenient = jsonWriter.isLenient();
        jsonWriter.setLenient(true);
        boolean isHtmlSafe = jsonWriter.isHtmlSafe();
        jsonWriter.setHtmlSafe(this.htmlSafe);
        boolean serializeNulls = jsonWriter.getSerializeNulls();
        jsonWriter.setSerializeNulls(this.serializeNulls);
        try {
            try {
                com.google.gson.internal.k.b(hVar, jsonWriter);
            } catch (IOException e10) {
                throw new i(e10);
            } catch (AssertionError e11) {
                throw new AssertionError("AssertionError (GSON 2.8.5): " + e11.getMessage(), e11);
            }
        } finally {
            jsonWriter.setLenient(isLenient);
            jsonWriter.setHtmlSafe(isHtmlSafe);
            jsonWriter.setSerializeNulls(serializeNulls);
        }
    }
}
