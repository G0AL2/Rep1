package com.google.gson.internal.bind;

import com.google.gson.e;
import com.google.gson.h;
import com.google.gson.j;
import com.google.gson.k;
import com.google.gson.m;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.io.Reader;
import java.util.Iterator;
import java.util.Map;

/* compiled from: JsonTreeReader.java */
/* loaded from: classes3.dex */
public final class a extends JsonReader {

    /* renamed from: e  reason: collision with root package name */
    private static final Reader f23835e = new C0312a();

    /* renamed from: f  reason: collision with root package name */
    private static final Object f23836f = new Object();

    /* renamed from: a  reason: collision with root package name */
    private Object[] f23837a;

    /* renamed from: b  reason: collision with root package name */
    private int f23838b;

    /* renamed from: c  reason: collision with root package name */
    private String[] f23839c;

    /* renamed from: d  reason: collision with root package name */
    private int[] f23840d;

    /* compiled from: JsonTreeReader.java */
    /* renamed from: com.google.gson.internal.bind.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    static class C0312a extends Reader {
        C0312a() {
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            throw new AssertionError();
        }

        @Override // java.io.Reader
        public int read(char[] cArr, int i10, int i11) throws IOException {
            throw new AssertionError();
        }
    }

    public a(h hVar) {
        super(f23835e);
        this.f23837a = new Object[32];
        this.f23838b = 0;
        this.f23839c = new String[32];
        this.f23840d = new int[32];
        h(hVar);
    }

    private void a(JsonToken jsonToken) throws IOException {
        if (peek() == jsonToken) {
            return;
        }
        throw new IllegalStateException("Expected " + jsonToken + " but was " + peek() + locationString());
    }

    private Object b() {
        return this.f23837a[this.f23838b - 1];
    }

    private Object d() {
        Object[] objArr = this.f23837a;
        int i10 = this.f23838b - 1;
        this.f23838b = i10;
        Object obj = objArr[i10];
        objArr[i10] = null;
        return obj;
    }

    private void h(Object obj) {
        int i10 = this.f23838b;
        Object[] objArr = this.f23837a;
        if (i10 == objArr.length) {
            Object[] objArr2 = new Object[i10 * 2];
            int[] iArr = new int[i10 * 2];
            String[] strArr = new String[i10 * 2];
            System.arraycopy(objArr, 0, objArr2, 0, i10);
            System.arraycopy(this.f23840d, 0, iArr, 0, this.f23838b);
            System.arraycopy(this.f23839c, 0, strArr, 0, this.f23838b);
            this.f23837a = objArr2;
            this.f23840d = iArr;
            this.f23839c = strArr;
        }
        Object[] objArr3 = this.f23837a;
        int i11 = this.f23838b;
        this.f23838b = i11 + 1;
        objArr3[i11] = obj;
    }

    private String locationString() {
        return " at path " + getPath();
    }

    @Override // com.google.gson.stream.JsonReader
    public void beginArray() throws IOException {
        a(JsonToken.BEGIN_ARRAY);
        h(((e) b()).iterator());
        this.f23840d[this.f23838b - 1] = 0;
    }

    @Override // com.google.gson.stream.JsonReader
    public void beginObject() throws IOException {
        a(JsonToken.BEGIN_OBJECT);
        h(((k) b()).n().iterator());
    }

    @Override // com.google.gson.stream.JsonReader, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f23837a = new Object[]{f23836f};
        this.f23838b = 1;
    }

    public void e() throws IOException {
        a(JsonToken.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) b()).next();
        h(entry.getValue());
        h(new m((String) entry.getKey()));
    }

    @Override // com.google.gson.stream.JsonReader
    public void endArray() throws IOException {
        a(JsonToken.END_ARRAY);
        d();
        d();
        int i10 = this.f23838b;
        if (i10 > 0) {
            int[] iArr = this.f23840d;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
    }

    @Override // com.google.gson.stream.JsonReader
    public void endObject() throws IOException {
        a(JsonToken.END_OBJECT);
        d();
        d();
        int i10 = this.f23838b;
        if (i10 > 0) {
            int[] iArr = this.f23840d;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
    }

    @Override // com.google.gson.stream.JsonReader
    public String getPath() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('$');
        int i10 = 0;
        while (i10 < this.f23838b) {
            Object[] objArr = this.f23837a;
            if (objArr[i10] instanceof e) {
                i10++;
                if (objArr[i10] instanceof Iterator) {
                    sb2.append('[');
                    sb2.append(this.f23840d[i10]);
                    sb2.append(']');
                }
            } else if (objArr[i10] instanceof k) {
                i10++;
                if (objArr[i10] instanceof Iterator) {
                    sb2.append('.');
                    String[] strArr = this.f23839c;
                    if (strArr[i10] != null) {
                        sb2.append(strArr[i10]);
                    }
                }
            }
            i10++;
        }
        return sb2.toString();
    }

    @Override // com.google.gson.stream.JsonReader
    public boolean hasNext() throws IOException {
        JsonToken peek = peek();
        return (peek == JsonToken.END_OBJECT || peek == JsonToken.END_ARRAY) ? false : true;
    }

    @Override // com.google.gson.stream.JsonReader
    public boolean nextBoolean() throws IOException {
        a(JsonToken.BOOLEAN);
        boolean m10 = ((m) d()).m();
        int i10 = this.f23838b;
        if (i10 > 0) {
            int[] iArr = this.f23840d;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return m10;
    }

    @Override // com.google.gson.stream.JsonReader
    public double nextDouble() throws IOException {
        JsonToken peek = peek();
        JsonToken jsonToken = JsonToken.NUMBER;
        if (peek != jsonToken && peek != JsonToken.STRING) {
            throw new IllegalStateException("Expected " + jsonToken + " but was " + peek + locationString());
        }
        double o10 = ((m) b()).o();
        if (!isLenient() && (Double.isNaN(o10) || Double.isInfinite(o10))) {
            throw new NumberFormatException("JSON forbids NaN and infinities: " + o10);
        }
        d();
        int i10 = this.f23838b;
        if (i10 > 0) {
            int[] iArr = this.f23840d;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return o10;
    }

    @Override // com.google.gson.stream.JsonReader
    public int nextInt() throws IOException {
        JsonToken peek = peek();
        JsonToken jsonToken = JsonToken.NUMBER;
        if (peek != jsonToken && peek != JsonToken.STRING) {
            throw new IllegalStateException("Expected " + jsonToken + " but was " + peek + locationString());
        }
        int p10 = ((m) b()).p();
        d();
        int i10 = this.f23838b;
        if (i10 > 0) {
            int[] iArr = this.f23840d;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return p10;
    }

    @Override // com.google.gson.stream.JsonReader
    public long nextLong() throws IOException {
        JsonToken peek = peek();
        JsonToken jsonToken = JsonToken.NUMBER;
        if (peek != jsonToken && peek != JsonToken.STRING) {
            throw new IllegalStateException("Expected " + jsonToken + " but was " + peek + locationString());
        }
        long q10 = ((m) b()).q();
        d();
        int i10 = this.f23838b;
        if (i10 > 0) {
            int[] iArr = this.f23840d;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return q10;
    }

    @Override // com.google.gson.stream.JsonReader
    public String nextName() throws IOException {
        a(JsonToken.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) b()).next();
        String str = (String) entry.getKey();
        this.f23839c[this.f23838b - 1] = str;
        h(entry.getValue());
        return str;
    }

    @Override // com.google.gson.stream.JsonReader
    public void nextNull() throws IOException {
        a(JsonToken.NULL);
        d();
        int i10 = this.f23838b;
        if (i10 > 0) {
            int[] iArr = this.f23840d;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
    }

    @Override // com.google.gson.stream.JsonReader
    public String nextString() throws IOException {
        JsonToken peek = peek();
        JsonToken jsonToken = JsonToken.STRING;
        if (peek != jsonToken && peek != JsonToken.NUMBER) {
            throw new IllegalStateException("Expected " + jsonToken + " but was " + peek + locationString());
        }
        String h10 = ((m) d()).h();
        int i10 = this.f23838b;
        if (i10 > 0) {
            int[] iArr = this.f23840d;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return h10;
    }

    @Override // com.google.gson.stream.JsonReader
    public JsonToken peek() throws IOException {
        if (this.f23838b == 0) {
            return JsonToken.END_DOCUMENT;
        }
        Object b10 = b();
        if (b10 instanceof Iterator) {
            boolean z10 = this.f23837a[this.f23838b - 2] instanceof k;
            Iterator it = (Iterator) b10;
            if (!it.hasNext()) {
                return z10 ? JsonToken.END_OBJECT : JsonToken.END_ARRAY;
            } else if (z10) {
                return JsonToken.NAME;
            } else {
                h(it.next());
                return peek();
            }
        } else if (b10 instanceof k) {
            return JsonToken.BEGIN_OBJECT;
        } else {
            if (b10 instanceof e) {
                return JsonToken.BEGIN_ARRAY;
            }
            if (b10 instanceof m) {
                m mVar = (m) b10;
                if (mVar.w()) {
                    return JsonToken.STRING;
                }
                if (mVar.s()) {
                    return JsonToken.BOOLEAN;
                }
                if (mVar.u()) {
                    return JsonToken.NUMBER;
                }
                throw new AssertionError();
            } else if (b10 instanceof j) {
                return JsonToken.NULL;
            } else {
                if (b10 == f23836f) {
                    throw new IllegalStateException("JsonReader is closed");
                }
                throw new AssertionError();
            }
        }
    }

    @Override // com.google.gson.stream.JsonReader
    public void skipValue() throws IOException {
        if (peek() == JsonToken.NAME) {
            nextName();
            this.f23839c[this.f23838b - 2] = "null";
        } else {
            d();
            int i10 = this.f23838b;
            if (i10 > 0) {
                this.f23839c[i10 - 1] = "null";
            }
        }
        int i11 = this.f23838b;
        if (i11 > 0) {
            int[] iArr = this.f23840d;
            int i12 = i11 - 1;
            iArr[i12] = iArr[i12] + 1;
        }
    }

    @Override // com.google.gson.stream.JsonReader
    public String toString() {
        return a.class.getSimpleName();
    }
}
