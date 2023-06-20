package com.google.gson.internal;

import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.p;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.stream.MalformedJsonException;
import java.io.EOFException;
import java.io.IOException;
import java.io.Writer;

/* compiled from: Streams.java */
/* loaded from: classes3.dex */
public final class k {
    public static com.google.gson.h a(JsonReader jsonReader) throws com.google.gson.l {
        boolean z10;
        try {
            try {
                jsonReader.peek();
                z10 = false;
                try {
                    return TypeAdapters.X.b(jsonReader);
                } catch (EOFException e10) {
                    e = e10;
                    if (z10) {
                        return com.google.gson.j.f23891a;
                    }
                    throw new p(e);
                }
            } catch (MalformedJsonException e11) {
                throw new p(e11);
            } catch (IOException e12) {
                throw new com.google.gson.i(e12);
            } catch (NumberFormatException e13) {
                throw new p(e13);
            }
        } catch (EOFException e14) {
            e = e14;
            z10 = true;
        }
    }

    public static void b(com.google.gson.h hVar, JsonWriter jsonWriter) throws IOException {
        TypeAdapters.X.d(jsonWriter, hVar);
    }

    public static Writer c(Appendable appendable) {
        return appendable instanceof Writer ? (Writer) appendable : new a(appendable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Streams.java */
    /* loaded from: classes3.dex */
    public static final class a extends Writer {

        /* renamed from: a  reason: collision with root package name */
        private final Appendable f23883a;

        /* renamed from: b  reason: collision with root package name */
        private final C0314a f23884b = new C0314a();

        /* compiled from: Streams.java */
        /* renamed from: com.google.gson.internal.k$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        static class C0314a implements CharSequence {

            /* renamed from: a  reason: collision with root package name */
            char[] f23885a;

            C0314a() {
            }

            @Override // java.lang.CharSequence
            public char charAt(int i10) {
                return this.f23885a[i10];
            }

            @Override // java.lang.CharSequence
            public int length() {
                return this.f23885a.length;
            }

            @Override // java.lang.CharSequence
            public CharSequence subSequence(int i10, int i11) {
                return new String(this.f23885a, i10, i11 - i10);
            }
        }

        a(Appendable appendable) {
            this.f23883a = appendable;
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i10, int i11) throws IOException {
            C0314a c0314a = this.f23884b;
            c0314a.f23885a = cArr;
            this.f23883a.append(c0314a, i10, i11 + i10);
        }

        @Override // java.io.Writer
        public void write(int i10) throws IOException {
            this.f23883a.append((char) i10);
        }
    }
}
