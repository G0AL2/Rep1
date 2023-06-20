package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.e;
import com.google.gson.h;
import com.google.gson.i;
import com.google.gson.internal.f;
import com.google.gson.j;
import com.google.gson.k;
import com.google.gson.m;
import com.google.gson.p;
import com.google.gson.r;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import ed.c;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* loaded from: classes3.dex */
public final class TypeAdapters {
    public static final TypeAdapter<String> A;
    public static final TypeAdapter<BigDecimal> B;
    public static final TypeAdapter<BigInteger> C;
    public static final r D;
    public static final TypeAdapter<StringBuilder> E;
    public static final r F;
    public static final TypeAdapter<StringBuffer> G;
    public static final r H;
    public static final TypeAdapter<URL> I;
    public static final r J;
    public static final TypeAdapter<URI> K;
    public static final r L;
    public static final TypeAdapter<InetAddress> M;
    public static final r N;
    public static final TypeAdapter<UUID> O;
    public static final r P;
    public static final TypeAdapter<Currency> Q;
    public static final r R;
    public static final r S;
    public static final TypeAdapter<Calendar> T;
    public static final r U;
    public static final TypeAdapter<Locale> V;
    public static final r W;
    public static final TypeAdapter<h> X;
    public static final r Y;
    public static final r Z;

    /* renamed from: a  reason: collision with root package name */
    public static final TypeAdapter<Class> f23791a;

    /* renamed from: b  reason: collision with root package name */
    public static final r f23792b;

    /* renamed from: c  reason: collision with root package name */
    public static final TypeAdapter<BitSet> f23793c;

    /* renamed from: d  reason: collision with root package name */
    public static final r f23794d;

    /* renamed from: e  reason: collision with root package name */
    public static final TypeAdapter<Boolean> f23795e;

    /* renamed from: f  reason: collision with root package name */
    public static final TypeAdapter<Boolean> f23796f;

    /* renamed from: g  reason: collision with root package name */
    public static final r f23797g;

    /* renamed from: h  reason: collision with root package name */
    public static final TypeAdapter<Number> f23798h;

    /* renamed from: i  reason: collision with root package name */
    public static final r f23799i;

    /* renamed from: j  reason: collision with root package name */
    public static final TypeAdapter<Number> f23800j;

    /* renamed from: k  reason: collision with root package name */
    public static final r f23801k;

    /* renamed from: l  reason: collision with root package name */
    public static final TypeAdapter<Number> f23802l;

    /* renamed from: m  reason: collision with root package name */
    public static final r f23803m;

    /* renamed from: n  reason: collision with root package name */
    public static final TypeAdapter<AtomicInteger> f23804n;

    /* renamed from: o  reason: collision with root package name */
    public static final r f23805o;

    /* renamed from: p  reason: collision with root package name */
    public static final TypeAdapter<AtomicBoolean> f23806p;

    /* renamed from: q  reason: collision with root package name */
    public static final r f23807q;

    /* renamed from: r  reason: collision with root package name */
    public static final TypeAdapter<AtomicIntegerArray> f23808r;

    /* renamed from: s  reason: collision with root package name */
    public static final r f23809s;

    /* renamed from: t  reason: collision with root package name */
    public static final TypeAdapter<Number> f23810t;

    /* renamed from: u  reason: collision with root package name */
    public static final TypeAdapter<Number> f23811u;

    /* renamed from: v  reason: collision with root package name */
    public static final TypeAdapter<Number> f23812v;

    /* renamed from: w  reason: collision with root package name */
    public static final TypeAdapter<Number> f23813w;

    /* renamed from: x  reason: collision with root package name */
    public static final r f23814x;

    /* renamed from: y  reason: collision with root package name */
    public static final TypeAdapter<Character> f23815y;

    /* renamed from: z  reason: collision with root package name */
    public static final r f23816z;

    /* loaded from: classes3.dex */
    private static final class EnumTypeAdapter<T extends Enum<T>> extends TypeAdapter<T> {

        /* renamed from: a  reason: collision with root package name */
        private final Map<String, T> f23832a = new HashMap();

        /* renamed from: b  reason: collision with root package name */
        private final Map<T, String> f23833b = new HashMap();

        public EnumTypeAdapter(Class<T> cls) {
            T[] enumConstants;
            try {
                for (T t10 : cls.getEnumConstants()) {
                    String name = t10.name();
                    c cVar = (c) cls.getField(name).getAnnotation(c.class);
                    if (cVar != null) {
                        name = cVar.value();
                        for (String str : cVar.alternate()) {
                            this.f23832a.put(str, t10);
                        }
                    }
                    this.f23832a.put(name, t10);
                    this.f23833b.put(t10, name);
                }
            } catch (NoSuchFieldException e10) {
                throw new AssertionError(e10);
            }
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: e */
        public T b(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            return this.f23832a.get(jsonReader.nextString());
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: f */
        public void d(JsonWriter jsonWriter, T t10) throws IOException {
            jsonWriter.value(t10 == null ? null : this.f23833b.get(t10));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f23834a;

        static {
            int[] iArr = new int[JsonToken.values().length];
            f23834a = iArr;
            try {
                iArr[JsonToken.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23834a[JsonToken.BOOLEAN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23834a[JsonToken.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f23834a[JsonToken.NULL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f23834a[JsonToken.BEGIN_ARRAY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f23834a[JsonToken.BEGIN_OBJECT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f23834a[JsonToken.END_DOCUMENT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f23834a[JsonToken.NAME.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f23834a[JsonToken.END_OBJECT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f23834a[JsonToken.END_ARRAY.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    static {
        TypeAdapter<Class> a10 = new TypeAdapter<Class>() { // from class: com.google.gson.internal.bind.TypeAdapters.1
            @Override // com.google.gson.TypeAdapter
            /* renamed from: e */
            public Class b(JsonReader jsonReader) throws IOException {
                throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: f */
            public void d(JsonWriter jsonWriter, Class cls) throws IOException {
                throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + cls.getName() + ". Forgot to register a type adapter?");
            }
        }.a();
        f23791a = a10;
        f23792b = b(Class.class, a10);
        TypeAdapter<BitSet> a11 = new TypeAdapter<BitSet>() { // from class: com.google.gson.internal.bind.TypeAdapters.2
            /* JADX WARN: Code restructure failed: missing block: B:13:0x002b, code lost:
                if (java.lang.Integer.parseInt(r1) != 0) goto L15;
             */
            /* JADX WARN: Code restructure failed: missing block: B:15:0x002e, code lost:
                r5 = false;
             */
            /* JADX WARN: Code restructure failed: missing block: B:22:0x0067, code lost:
                if (r8.nextInt() != 0) goto L15;
             */
            @Override // com.google.gson.TypeAdapter
            /* renamed from: e */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public java.util.BitSet b(com.google.gson.stream.JsonReader r8) throws java.io.IOException {
                /*
                    r7 = this;
                    java.util.BitSet r0 = new java.util.BitSet
                    r0.<init>()
                    r8.beginArray()
                    com.google.gson.stream.JsonToken r1 = r8.peek()
                    r2 = 0
                    r3 = 0
                Le:
                    com.google.gson.stream.JsonToken r4 = com.google.gson.stream.JsonToken.END_ARRAY
                    if (r1 == r4) goto L75
                    int[] r4 = com.google.gson.internal.bind.TypeAdapters.a.f23834a
                    int r5 = r1.ordinal()
                    r4 = r4[r5]
                    r5 = 1
                    if (r4 == r5) goto L63
                    r6 = 2
                    if (r4 == r6) goto L5e
                    r6 = 3
                    if (r4 != r6) goto L47
                    java.lang.String r1 = r8.nextString()
                    int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.NumberFormatException -> L30
                    if (r1 == 0) goto L2e
                    goto L69
                L2e:
                    r5 = 0
                    goto L69
                L30:
                    com.google.gson.p r8 = new com.google.gson.p
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    java.lang.String r2 = "Error: Expecting: bitset number value (1, 0), Found: "
                    r0.append(r2)
                    r0.append(r1)
                    java.lang.String r0 = r0.toString()
                    r8.<init>(r0)
                    throw r8
                L47:
                    com.google.gson.p r8 = new com.google.gson.p
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    java.lang.String r2 = "Invalid bitset value type: "
                    r0.append(r2)
                    r0.append(r1)
                    java.lang.String r0 = r0.toString()
                    r8.<init>(r0)
                    throw r8
                L5e:
                    boolean r5 = r8.nextBoolean()
                    goto L69
                L63:
                    int r1 = r8.nextInt()
                    if (r1 == 0) goto L2e
                L69:
                    if (r5 == 0) goto L6e
                    r0.set(r3)
                L6e:
                    int r3 = r3 + 1
                    com.google.gson.stream.JsonToken r1 = r8.peek()
                    goto Le
                L75:
                    r8.endArray()
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.TypeAdapters.AnonymousClass2.b(com.google.gson.stream.JsonReader):java.util.BitSet");
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: f */
            public void d(JsonWriter jsonWriter, BitSet bitSet) throws IOException {
                jsonWriter.beginArray();
                int length = bitSet.length();
                for (int i10 = 0; i10 < length; i10++) {
                    jsonWriter.value(bitSet.get(i10) ? 1L : 0L);
                }
                jsonWriter.endArray();
            }
        }.a();
        f23793c = a11;
        f23794d = b(BitSet.class, a11);
        TypeAdapter<Boolean> typeAdapter = new TypeAdapter<Boolean>() { // from class: com.google.gson.internal.bind.TypeAdapters.3
            @Override // com.google.gson.TypeAdapter
            /* renamed from: e */
            public Boolean b(JsonReader jsonReader) throws IOException {
                JsonToken peek = jsonReader.peek();
                if (peek == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                } else if (peek == JsonToken.STRING) {
                    return Boolean.valueOf(Boolean.parseBoolean(jsonReader.nextString()));
                } else {
                    return Boolean.valueOf(jsonReader.nextBoolean());
                }
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: f */
            public void d(JsonWriter jsonWriter, Boolean bool) throws IOException {
                jsonWriter.value(bool);
            }
        };
        f23795e = typeAdapter;
        f23796f = new TypeAdapter<Boolean>() { // from class: com.google.gson.internal.bind.TypeAdapters.4
            @Override // com.google.gson.TypeAdapter
            /* renamed from: e */
            public Boolean b(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                return Boolean.valueOf(jsonReader.nextString());
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: f */
            public void d(JsonWriter jsonWriter, Boolean bool) throws IOException {
                jsonWriter.value(bool == null ? "null" : bool.toString());
            }
        };
        f23797g = c(Boolean.TYPE, Boolean.class, typeAdapter);
        TypeAdapter<Number> typeAdapter2 = new TypeAdapter<Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.5
            @Override // com.google.gson.TypeAdapter
            /* renamed from: e */
            public Number b(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                try {
                    return Byte.valueOf((byte) jsonReader.nextInt());
                } catch (NumberFormatException e10) {
                    throw new p(e10);
                }
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: f */
            public void d(JsonWriter jsonWriter, Number number) throws IOException {
                jsonWriter.value(number);
            }
        };
        f23798h = typeAdapter2;
        f23799i = c(Byte.TYPE, Byte.class, typeAdapter2);
        TypeAdapter<Number> typeAdapter3 = new TypeAdapter<Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.6
            @Override // com.google.gson.TypeAdapter
            /* renamed from: e */
            public Number b(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                try {
                    return Short.valueOf((short) jsonReader.nextInt());
                } catch (NumberFormatException e10) {
                    throw new p(e10);
                }
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: f */
            public void d(JsonWriter jsonWriter, Number number) throws IOException {
                jsonWriter.value(number);
            }
        };
        f23800j = typeAdapter3;
        f23801k = c(Short.TYPE, Short.class, typeAdapter3);
        TypeAdapter<Number> typeAdapter4 = new TypeAdapter<Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.7
            @Override // com.google.gson.TypeAdapter
            /* renamed from: e */
            public Number b(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                try {
                    return Integer.valueOf(jsonReader.nextInt());
                } catch (NumberFormatException e10) {
                    throw new p(e10);
                }
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: f */
            public void d(JsonWriter jsonWriter, Number number) throws IOException {
                jsonWriter.value(number);
            }
        };
        f23802l = typeAdapter4;
        f23803m = c(Integer.TYPE, Integer.class, typeAdapter4);
        TypeAdapter<AtomicInteger> a12 = new TypeAdapter<AtomicInteger>() { // from class: com.google.gson.internal.bind.TypeAdapters.8
            @Override // com.google.gson.TypeAdapter
            /* renamed from: e */
            public AtomicInteger b(JsonReader jsonReader) throws IOException {
                try {
                    return new AtomicInteger(jsonReader.nextInt());
                } catch (NumberFormatException e10) {
                    throw new p(e10);
                }
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: f */
            public void d(JsonWriter jsonWriter, AtomicInteger atomicInteger) throws IOException {
                jsonWriter.value(atomicInteger.get());
            }
        }.a();
        f23804n = a12;
        f23805o = b(AtomicInteger.class, a12);
        TypeAdapter<AtomicBoolean> a13 = new TypeAdapter<AtomicBoolean>() { // from class: com.google.gson.internal.bind.TypeAdapters.9
            @Override // com.google.gson.TypeAdapter
            /* renamed from: e */
            public AtomicBoolean b(JsonReader jsonReader) throws IOException {
                return new AtomicBoolean(jsonReader.nextBoolean());
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: f */
            public void d(JsonWriter jsonWriter, AtomicBoolean atomicBoolean) throws IOException {
                jsonWriter.value(atomicBoolean.get());
            }
        }.a();
        f23806p = a13;
        f23807q = b(AtomicBoolean.class, a13);
        TypeAdapter<AtomicIntegerArray> a14 = new TypeAdapter<AtomicIntegerArray>() { // from class: com.google.gson.internal.bind.TypeAdapters.10
            @Override // com.google.gson.TypeAdapter
            /* renamed from: e */
            public AtomicIntegerArray b(JsonReader jsonReader) throws IOException {
                ArrayList arrayList = new ArrayList();
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    try {
                        arrayList.add(Integer.valueOf(jsonReader.nextInt()));
                    } catch (NumberFormatException e10) {
                        throw new p(e10);
                    }
                }
                jsonReader.endArray();
                int size = arrayList.size();
                AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
                for (int i10 = 0; i10 < size; i10++) {
                    atomicIntegerArray.set(i10, ((Integer) arrayList.get(i10)).intValue());
                }
                return atomicIntegerArray;
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: f */
            public void d(JsonWriter jsonWriter, AtomicIntegerArray atomicIntegerArray) throws IOException {
                jsonWriter.beginArray();
                int length = atomicIntegerArray.length();
                for (int i10 = 0; i10 < length; i10++) {
                    jsonWriter.value(atomicIntegerArray.get(i10));
                }
                jsonWriter.endArray();
            }
        }.a();
        f23808r = a14;
        f23809s = b(AtomicIntegerArray.class, a14);
        f23810t = new TypeAdapter<Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.11
            @Override // com.google.gson.TypeAdapter
            /* renamed from: e */
            public Number b(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                try {
                    return Long.valueOf(jsonReader.nextLong());
                } catch (NumberFormatException e10) {
                    throw new p(e10);
                }
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: f */
            public void d(JsonWriter jsonWriter, Number number) throws IOException {
                jsonWriter.value(number);
            }
        };
        f23811u = new TypeAdapter<Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.12
            @Override // com.google.gson.TypeAdapter
            /* renamed from: e */
            public Number b(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                return Float.valueOf((float) jsonReader.nextDouble());
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: f */
            public void d(JsonWriter jsonWriter, Number number) throws IOException {
                jsonWriter.value(number);
            }
        };
        f23812v = new TypeAdapter<Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.13
            @Override // com.google.gson.TypeAdapter
            /* renamed from: e */
            public Number b(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                return Double.valueOf(jsonReader.nextDouble());
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: f */
            public void d(JsonWriter jsonWriter, Number number) throws IOException {
                jsonWriter.value(number);
            }
        };
        TypeAdapter<Number> typeAdapter5 = new TypeAdapter<Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.14
            @Override // com.google.gson.TypeAdapter
            /* renamed from: e */
            public Number b(JsonReader jsonReader) throws IOException {
                JsonToken peek = jsonReader.peek();
                int i10 = a.f23834a[peek.ordinal()];
                if (i10 == 1 || i10 == 3) {
                    return new f(jsonReader.nextString());
                }
                if (i10 == 4) {
                    jsonReader.nextNull();
                    return null;
                }
                throw new p("Expecting number, got: " + peek);
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: f */
            public void d(JsonWriter jsonWriter, Number number) throws IOException {
                jsonWriter.value(number);
            }
        };
        f23813w = typeAdapter5;
        f23814x = b(Number.class, typeAdapter5);
        TypeAdapter<Character> typeAdapter6 = new TypeAdapter<Character>() { // from class: com.google.gson.internal.bind.TypeAdapters.15
            @Override // com.google.gson.TypeAdapter
            /* renamed from: e */
            public Character b(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                String nextString = jsonReader.nextString();
                if (nextString.length() == 1) {
                    return Character.valueOf(nextString.charAt(0));
                }
                throw new p("Expecting character, got: " + nextString);
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: f */
            public void d(JsonWriter jsonWriter, Character ch) throws IOException {
                jsonWriter.value(ch == null ? null : String.valueOf(ch));
            }
        };
        f23815y = typeAdapter6;
        f23816z = c(Character.TYPE, Character.class, typeAdapter6);
        TypeAdapter<String> typeAdapter7 = new TypeAdapter<String>() { // from class: com.google.gson.internal.bind.TypeAdapters.16
            @Override // com.google.gson.TypeAdapter
            /* renamed from: e */
            public String b(JsonReader jsonReader) throws IOException {
                JsonToken peek = jsonReader.peek();
                if (peek == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                } else if (peek == JsonToken.BOOLEAN) {
                    return Boolean.toString(jsonReader.nextBoolean());
                } else {
                    return jsonReader.nextString();
                }
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: f */
            public void d(JsonWriter jsonWriter, String str) throws IOException {
                jsonWriter.value(str);
            }
        };
        A = typeAdapter7;
        B = new TypeAdapter<BigDecimal>() { // from class: com.google.gson.internal.bind.TypeAdapters.17
            @Override // com.google.gson.TypeAdapter
            /* renamed from: e */
            public BigDecimal b(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                try {
                    return new BigDecimal(jsonReader.nextString());
                } catch (NumberFormatException e10) {
                    throw new p(e10);
                }
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: f */
            public void d(JsonWriter jsonWriter, BigDecimal bigDecimal) throws IOException {
                jsonWriter.value(bigDecimal);
            }
        };
        C = new TypeAdapter<BigInteger>() { // from class: com.google.gson.internal.bind.TypeAdapters.18
            @Override // com.google.gson.TypeAdapter
            /* renamed from: e */
            public BigInteger b(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                try {
                    return new BigInteger(jsonReader.nextString());
                } catch (NumberFormatException e10) {
                    throw new p(e10);
                }
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: f */
            public void d(JsonWriter jsonWriter, BigInteger bigInteger) throws IOException {
                jsonWriter.value(bigInteger);
            }
        };
        D = b(String.class, typeAdapter7);
        TypeAdapter<StringBuilder> typeAdapter8 = new TypeAdapter<StringBuilder>() { // from class: com.google.gson.internal.bind.TypeAdapters.19
            @Override // com.google.gson.TypeAdapter
            /* renamed from: e */
            public StringBuilder b(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                return new StringBuilder(jsonReader.nextString());
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: f */
            public void d(JsonWriter jsonWriter, StringBuilder sb2) throws IOException {
                jsonWriter.value(sb2 == null ? null : sb2.toString());
            }
        };
        E = typeAdapter8;
        F = b(StringBuilder.class, typeAdapter8);
        TypeAdapter<StringBuffer> typeAdapter9 = new TypeAdapter<StringBuffer>() { // from class: com.google.gson.internal.bind.TypeAdapters.20
            @Override // com.google.gson.TypeAdapter
            /* renamed from: e */
            public StringBuffer b(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                return new StringBuffer(jsonReader.nextString());
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: f */
            public void d(JsonWriter jsonWriter, StringBuffer stringBuffer) throws IOException {
                jsonWriter.value(stringBuffer == null ? null : stringBuffer.toString());
            }
        };
        G = typeAdapter9;
        H = b(StringBuffer.class, typeAdapter9);
        TypeAdapter<URL> typeAdapter10 = new TypeAdapter<URL>() { // from class: com.google.gson.internal.bind.TypeAdapters.21
            @Override // com.google.gson.TypeAdapter
            /* renamed from: e */
            public URL b(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                String nextString = jsonReader.nextString();
                if ("null".equals(nextString)) {
                    return null;
                }
                return new URL(nextString);
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: f */
            public void d(JsonWriter jsonWriter, URL url) throws IOException {
                jsonWriter.value(url == null ? null : url.toExternalForm());
            }
        };
        I = typeAdapter10;
        J = b(URL.class, typeAdapter10);
        TypeAdapter<URI> typeAdapter11 = new TypeAdapter<URI>() { // from class: com.google.gson.internal.bind.TypeAdapters.22
            @Override // com.google.gson.TypeAdapter
            /* renamed from: e */
            public URI b(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                try {
                    String nextString = jsonReader.nextString();
                    if ("null".equals(nextString)) {
                        return null;
                    }
                    return new URI(nextString);
                } catch (URISyntaxException e10) {
                    throw new i(e10);
                }
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: f */
            public void d(JsonWriter jsonWriter, URI uri) throws IOException {
                jsonWriter.value(uri == null ? null : uri.toASCIIString());
            }
        };
        K = typeAdapter11;
        L = b(URI.class, typeAdapter11);
        TypeAdapter<InetAddress> typeAdapter12 = new TypeAdapter<InetAddress>() { // from class: com.google.gson.internal.bind.TypeAdapters.23
            @Override // com.google.gson.TypeAdapter
            /* renamed from: e */
            public InetAddress b(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                return InetAddress.getByName(jsonReader.nextString());
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: f */
            public void d(JsonWriter jsonWriter, InetAddress inetAddress) throws IOException {
                jsonWriter.value(inetAddress == null ? null : inetAddress.getHostAddress());
            }
        };
        M = typeAdapter12;
        N = e(InetAddress.class, typeAdapter12);
        TypeAdapter<UUID> typeAdapter13 = new TypeAdapter<UUID>() { // from class: com.google.gson.internal.bind.TypeAdapters.24
            @Override // com.google.gson.TypeAdapter
            /* renamed from: e */
            public UUID b(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                return UUID.fromString(jsonReader.nextString());
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: f */
            public void d(JsonWriter jsonWriter, UUID uuid) throws IOException {
                jsonWriter.value(uuid == null ? null : uuid.toString());
            }
        };
        O = typeAdapter13;
        P = b(UUID.class, typeAdapter13);
        TypeAdapter<Currency> a15 = new TypeAdapter<Currency>() { // from class: com.google.gson.internal.bind.TypeAdapters.25
            @Override // com.google.gson.TypeAdapter
            /* renamed from: e */
            public Currency b(JsonReader jsonReader) throws IOException {
                return Currency.getInstance(jsonReader.nextString());
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: f */
            public void d(JsonWriter jsonWriter, Currency currency) throws IOException {
                jsonWriter.value(currency.getCurrencyCode());
            }
        }.a();
        Q = a15;
        R = b(Currency.class, a15);
        S = new r() { // from class: com.google.gson.internal.bind.TypeAdapters.26
            @Override // com.google.gson.r
            public <T> TypeAdapter<T> a(Gson gson, com.google.gson.reflect.a<T> aVar) {
                if (aVar.c() != Timestamp.class) {
                    return null;
                }
                final TypeAdapter<T> adapter = gson.getAdapter(Date.class);
                return (TypeAdapter<T>) new TypeAdapter<Timestamp>(this) { // from class: com.google.gson.internal.bind.TypeAdapters.26.1
                    @Override // com.google.gson.TypeAdapter
                    /* renamed from: e */
                    public Timestamp b(JsonReader jsonReader) throws IOException {
                        Date date = (Date) adapter.b(jsonReader);
                        if (date != null) {
                            return new Timestamp(date.getTime());
                        }
                        return null;
                    }

                    @Override // com.google.gson.TypeAdapter
                    /* renamed from: f */
                    public void d(JsonWriter jsonWriter, Timestamp timestamp) throws IOException {
                        adapter.d(jsonWriter, timestamp);
                    }
                };
            }
        };
        TypeAdapter<Calendar> typeAdapter14 = new TypeAdapter<Calendar>() { // from class: com.google.gson.internal.bind.TypeAdapters.27
            @Override // com.google.gson.TypeAdapter
            /* renamed from: e */
            public Calendar b(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                jsonReader.beginObject();
                int i10 = 0;
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                int i14 = 0;
                int i15 = 0;
                while (jsonReader.peek() != JsonToken.END_OBJECT) {
                    String nextName = jsonReader.nextName();
                    int nextInt = jsonReader.nextInt();
                    if ("year".equals(nextName)) {
                        i10 = nextInt;
                    } else if ("month".equals(nextName)) {
                        i11 = nextInt;
                    } else if ("dayOfMonth".equals(nextName)) {
                        i12 = nextInt;
                    } else if ("hourOfDay".equals(nextName)) {
                        i13 = nextInt;
                    } else if ("minute".equals(nextName)) {
                        i14 = nextInt;
                    } else if ("second".equals(nextName)) {
                        i15 = nextInt;
                    }
                }
                jsonReader.endObject();
                return new GregorianCalendar(i10, i11, i12, i13, i14, i15);
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: f */
            public void d(JsonWriter jsonWriter, Calendar calendar) throws IOException {
                if (calendar == null) {
                    jsonWriter.nullValue();
                    return;
                }
                jsonWriter.beginObject();
                jsonWriter.name("year");
                jsonWriter.value(calendar.get(1));
                jsonWriter.name("month");
                jsonWriter.value(calendar.get(2));
                jsonWriter.name("dayOfMonth");
                jsonWriter.value(calendar.get(5));
                jsonWriter.name("hourOfDay");
                jsonWriter.value(calendar.get(11));
                jsonWriter.name("minute");
                jsonWriter.value(calendar.get(12));
                jsonWriter.name("second");
                jsonWriter.value(calendar.get(13));
                jsonWriter.endObject();
            }
        };
        T = typeAdapter14;
        U = d(Calendar.class, GregorianCalendar.class, typeAdapter14);
        TypeAdapter<Locale> typeAdapter15 = new TypeAdapter<Locale>() { // from class: com.google.gson.internal.bind.TypeAdapters.28
            @Override // com.google.gson.TypeAdapter
            /* renamed from: e */
            public Locale b(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                StringTokenizer stringTokenizer = new StringTokenizer(jsonReader.nextString(), "_");
                String nextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                String nextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                String nextToken3 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                if (nextToken2 == null && nextToken3 == null) {
                    return new Locale(nextToken);
                }
                if (nextToken3 == null) {
                    return new Locale(nextToken, nextToken2);
                }
                return new Locale(nextToken, nextToken2, nextToken3);
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: f */
            public void d(JsonWriter jsonWriter, Locale locale) throws IOException {
                jsonWriter.value(locale == null ? null : locale.toString());
            }
        };
        V = typeAdapter15;
        W = b(Locale.class, typeAdapter15);
        TypeAdapter<h> typeAdapter16 = new TypeAdapter<h>() { // from class: com.google.gson.internal.bind.TypeAdapters.29
            @Override // com.google.gson.TypeAdapter
            /* renamed from: e */
            public h b(JsonReader jsonReader) throws IOException {
                switch (a.f23834a[jsonReader.peek().ordinal()]) {
                    case 1:
                        return new m(new f(jsonReader.nextString()));
                    case 2:
                        return new m(Boolean.valueOf(jsonReader.nextBoolean()));
                    case 3:
                        return new m(jsonReader.nextString());
                    case 4:
                        jsonReader.nextNull();
                        return j.f23891a;
                    case 5:
                        e eVar = new e();
                        jsonReader.beginArray();
                        while (jsonReader.hasNext()) {
                            eVar.m(b(jsonReader));
                        }
                        jsonReader.endArray();
                        return eVar;
                    case 6:
                        k kVar = new k();
                        jsonReader.beginObject();
                        while (jsonReader.hasNext()) {
                            kVar.m(jsonReader.nextName(), b(jsonReader));
                        }
                        jsonReader.endObject();
                        return kVar;
                    default:
                        throw new IllegalArgumentException();
                }
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: f */
            public void d(JsonWriter jsonWriter, h hVar) throws IOException {
                if (hVar != null && !hVar.j()) {
                    if (hVar.l()) {
                        m g10 = hVar.g();
                        if (g10.u()) {
                            jsonWriter.value(g10.r());
                            return;
                        } else if (g10.s()) {
                            jsonWriter.value(g10.m());
                            return;
                        } else {
                            jsonWriter.value(g10.h());
                            return;
                        }
                    } else if (hVar.i()) {
                        jsonWriter.beginArray();
                        Iterator<h> it = hVar.e().iterator();
                        while (it.hasNext()) {
                            d(jsonWriter, it.next());
                        }
                        jsonWriter.endArray();
                        return;
                    } else if (hVar.k()) {
                        jsonWriter.beginObject();
                        for (Map.Entry<String, h> entry : hVar.f().n()) {
                            jsonWriter.name(entry.getKey());
                            d(jsonWriter, entry.getValue());
                        }
                        jsonWriter.endObject();
                        return;
                    } else {
                        throw new IllegalArgumentException("Couldn't write " + hVar.getClass());
                    }
                }
                jsonWriter.nullValue();
            }
        };
        X = typeAdapter16;
        Y = e(h.class, typeAdapter16);
        Z = new r() { // from class: com.google.gson.internal.bind.TypeAdapters.30
            @Override // com.google.gson.r
            public <T> TypeAdapter<T> a(Gson gson, com.google.gson.reflect.a<T> aVar) {
                Class c10 = aVar.c();
                if (!Enum.class.isAssignableFrom(c10) || c10 == Enum.class) {
                    return null;
                }
                if (!c10.isEnum()) {
                    c10 = (Class<? super Object>) c10.getSuperclass();
                }
                return new EnumTypeAdapter(c10);
            }
        };
    }

    public static <TT> r a(final com.google.gson.reflect.a<TT> aVar, final TypeAdapter<TT> typeAdapter) {
        return new r() { // from class: com.google.gson.internal.bind.TypeAdapters.31
            @Override // com.google.gson.r
            public <T> TypeAdapter<T> a(Gson gson, com.google.gson.reflect.a<T> aVar2) {
                if (aVar2.equals(com.google.gson.reflect.a.this)) {
                    return typeAdapter;
                }
                return null;
            }
        };
    }

    public static <TT> r b(final Class<TT> cls, final TypeAdapter<TT> typeAdapter) {
        return new r() { // from class: com.google.gson.internal.bind.TypeAdapters.32
            @Override // com.google.gson.r
            public <T> TypeAdapter<T> a(Gson gson, com.google.gson.reflect.a<T> aVar) {
                if (aVar.c() == cls) {
                    return typeAdapter;
                }
                return null;
            }

            public String toString() {
                return "Factory[type=" + cls.getName() + ",adapter=" + typeAdapter + "]";
            }
        };
    }

    public static <TT> r c(final Class<TT> cls, final Class<TT> cls2, final TypeAdapter<? super TT> typeAdapter) {
        return new r() { // from class: com.google.gson.internal.bind.TypeAdapters.33
            @Override // com.google.gson.r
            public <T> TypeAdapter<T> a(Gson gson, com.google.gson.reflect.a<T> aVar) {
                Class<? super T> c10 = aVar.c();
                if (c10 == cls || c10 == cls2) {
                    return typeAdapter;
                }
                return null;
            }

            public String toString() {
                return "Factory[type=" + cls2.getName() + "+" + cls.getName() + ",adapter=" + typeAdapter + "]";
            }
        };
    }

    public static <TT> r d(final Class<TT> cls, final Class<? extends TT> cls2, final TypeAdapter<? super TT> typeAdapter) {
        return new r() { // from class: com.google.gson.internal.bind.TypeAdapters.34
            @Override // com.google.gson.r
            public <T> TypeAdapter<T> a(Gson gson, com.google.gson.reflect.a<T> aVar) {
                Class<? super T> c10 = aVar.c();
                if (c10 == cls || c10 == cls2) {
                    return typeAdapter;
                }
                return null;
            }

            public String toString() {
                return "Factory[type=" + cls.getName() + "+" + cls2.getName() + ",adapter=" + typeAdapter + "]";
            }
        };
    }

    public static <T1> r e(final Class<T1> cls, final TypeAdapter<T1> typeAdapter) {
        return new r() { // from class: com.google.gson.internal.bind.TypeAdapters.35
            @Override // com.google.gson.r
            public <T2> TypeAdapter<T2> a(Gson gson, com.google.gson.reflect.a<T2> aVar) {
                final Class<? super T2> c10 = aVar.c();
                if (cls.isAssignableFrom(c10)) {
                    return (TypeAdapter<T2>) new TypeAdapter<T1>() { // from class: com.google.gson.internal.bind.TypeAdapters.35.1
                        @Override // com.google.gson.TypeAdapter
                        public T1 b(JsonReader jsonReader) throws IOException {
                            T1 t12 = (T1) typeAdapter.b(jsonReader);
                            if (t12 == null || c10.isInstance(t12)) {
                                return t12;
                            }
                            throw new p("Expected a " + c10.getName() + " but was " + t12.getClass().getName());
                        }

                        @Override // com.google.gson.TypeAdapter
                        public void d(JsonWriter jsonWriter, T1 t12) throws IOException {
                            typeAdapter.d(jsonWriter, t12);
                        }
                    };
                }
                return null;
            }

            public String toString() {
                return "Factory[typeHierarchy=" + cls.getName() + ",adapter=" + typeAdapter + "]";
            }
        };
    }
}
