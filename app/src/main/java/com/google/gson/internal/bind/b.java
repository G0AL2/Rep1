package com.google.gson.internal.bind;

import com.google.gson.e;
import com.google.gson.h;
import com.google.gson.j;
import com.google.gson.k;
import com.google.gson.m;
import com.google.gson.stream.JsonWriter;
import com.vehiclecloud.app.videofetch.rnads.api.RNAdsEvents;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

/* compiled from: JsonTreeWriter.java */
/* loaded from: classes3.dex */
public final class b extends JsonWriter {

    /* renamed from: d  reason: collision with root package name */
    private static final Writer f23841d = new a();

    /* renamed from: e  reason: collision with root package name */
    private static final m f23842e = new m(RNAdsEvents.EVENT_CLOSED);

    /* renamed from: a  reason: collision with root package name */
    private final List<h> f23843a;

    /* renamed from: b  reason: collision with root package name */
    private String f23844b;

    /* renamed from: c  reason: collision with root package name */
    private h f23845c;

    /* compiled from: JsonTreeWriter.java */
    /* loaded from: classes3.dex */
    static class a extends Writer {
        a() {
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            throw new AssertionError();
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() throws IOException {
            throw new AssertionError();
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i10, int i11) {
            throw new AssertionError();
        }
    }

    public b() {
        super(f23841d);
        this.f23843a = new ArrayList();
        this.f23845c = j.f23891a;
    }

    private h b() {
        List<h> list = this.f23843a;
        return list.get(list.size() - 1);
    }

    private void d(h hVar) {
        if (this.f23844b != null) {
            if (!hVar.j() || getSerializeNulls()) {
                ((k) b()).m(this.f23844b, hVar);
            }
            this.f23844b = null;
        } else if (this.f23843a.isEmpty()) {
            this.f23845c = hVar;
        } else {
            h b10 = b();
            if (b10 instanceof e) {
                ((e) b10).m(hVar);
                return;
            }
            throw new IllegalStateException();
        }
    }

    public h a() {
        if (this.f23843a.isEmpty()) {
            return this.f23845c;
        }
        throw new IllegalStateException("Expected one JSON element but was " + this.f23843a);
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter beginArray() throws IOException {
        e eVar = new e();
        d(eVar);
        this.f23843a.add(eVar);
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter beginObject() throws IOException {
        k kVar = new k();
        d(kVar);
        this.f23843a.add(kVar);
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f23843a.isEmpty()) {
            this.f23843a.add(f23842e);
            return;
        }
        throw new IOException("Incomplete document");
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter endArray() throws IOException {
        if (!this.f23843a.isEmpty() && this.f23844b == null) {
            if (b() instanceof e) {
                List<h> list = this.f23843a;
                list.remove(list.size() - 1);
                return this;
            }
            throw new IllegalStateException();
        }
        throw new IllegalStateException();
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter endObject() throws IOException {
        if (!this.f23843a.isEmpty() && this.f23844b == null) {
            if (b() instanceof k) {
                List<h> list = this.f23843a;
                list.remove(list.size() - 1);
                return this;
            }
            throw new IllegalStateException();
        }
        throw new IllegalStateException();
    }

    @Override // com.google.gson.stream.JsonWriter, java.io.Flushable
    public void flush() throws IOException {
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter name(String str) throws IOException {
        if (!this.f23843a.isEmpty() && this.f23844b == null) {
            if (b() instanceof k) {
                this.f23844b = str;
                return this;
            }
            throw new IllegalStateException();
        }
        throw new IllegalStateException();
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter nullValue() throws IOException {
        d(j.f23891a);
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter value(String str) throws IOException {
        if (str == null) {
            return nullValue();
        }
        d(new m(str));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter value(boolean z10) throws IOException {
        d(new m(Boolean.valueOf(z10)));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter value(Boolean bool) throws IOException {
        if (bool == null) {
            return nullValue();
        }
        d(new m(bool));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter value(double d10) throws IOException {
        if (!isLenient() && (Double.isNaN(d10) || Double.isInfinite(d10))) {
            throw new IllegalArgumentException("JSON forbids NaN and infinities: " + d10);
        }
        d(new m(Double.valueOf(d10)));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter value(long j10) throws IOException {
        d(new m(Long.valueOf(j10)));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter value(Number number) throws IOException {
        if (number == null) {
            return nullValue();
        }
        if (!isLenient()) {
            double doubleValue = number.doubleValue();
            if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        d(new m(number));
        return this;
    }
}
