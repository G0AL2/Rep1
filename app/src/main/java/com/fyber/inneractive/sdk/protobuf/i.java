package com.fyber.inneractive.sdk.protobuf;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public abstract class i implements Iterable<Byte>, Serializable {

    /* renamed from: b  reason: collision with root package name */
    public static final i f19881b = new h(z.f20079b);

    /* renamed from: c  reason: collision with root package name */
    public static final e f19882c;

    /* renamed from: a  reason: collision with root package name */
    public int f19883a = 0;

    /* loaded from: classes2.dex */
    public class a extends b {

        /* renamed from: a  reason: collision with root package name */
        public int f19884a = 0;

        /* renamed from: b  reason: collision with root package name */
        public final int f19885b;

        public a() {
            this.f19885b = i.this.size();
        }

        @Override // com.fyber.inneractive.sdk.protobuf.i.f
        public byte a() {
            int i10 = this.f19884a;
            if (i10 < this.f19885b) {
                this.f19884a = i10 + 1;
                return i.this.d(i10);
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f19884a < this.f19885b;
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class b implements f {
        @Override // java.util.Iterator
        public Byte next() {
            return Byte.valueOf(a());
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* loaded from: classes2.dex */
    public static final class c implements e {
        @Override // com.fyber.inneractive.sdk.protobuf.i.e
        public byte[] a(byte[] bArr, int i10, int i11) {
            return Arrays.copyOfRange(bArr, i10, i11 + i10);
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends h {
        private static final long serialVersionUID = 1;

        /* renamed from: e  reason: collision with root package name */
        public final int f19887e;

        /* renamed from: f  reason: collision with root package name */
        public final int f19888f;

        public d(byte[] bArr, int i10, int i11) {
            super(bArr);
            i.a(i10, i10 + i11, bArr.length);
            this.f19887e = i10;
            this.f19888f = i11;
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException {
            throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
        }

        @Override // com.fyber.inneractive.sdk.protobuf.i.h, com.fyber.inneractive.sdk.protobuf.i
        public void a(byte[] bArr, int i10, int i11, int i12) {
            System.arraycopy(this.f19889d, this.f19887e + i10, bArr, i11, i12);
        }

        @Override // com.fyber.inneractive.sdk.protobuf.i.h, com.fyber.inneractive.sdk.protobuf.i
        public byte c(int i10) {
            i.a(i10, this.f19888f);
            return this.f19889d[this.f19887e + i10];
        }

        @Override // com.fyber.inneractive.sdk.protobuf.i.h, com.fyber.inneractive.sdk.protobuf.i
        public byte d(int i10) {
            return this.f19889d[this.f19887e + i10];
        }

        @Override // com.fyber.inneractive.sdk.protobuf.i.h
        public int j() {
            return this.f19887e;
        }

        @Override // com.fyber.inneractive.sdk.protobuf.i.h, com.fyber.inneractive.sdk.protobuf.i
        public int size() {
            return this.f19888f;
        }

        public Object writeReplace() {
            return new h(h());
        }
    }

    /* loaded from: classes2.dex */
    public interface e {
        byte[] a(byte[] bArr, int i10, int i11);
    }

    /* loaded from: classes2.dex */
    public interface f extends Iterator<Byte> {
        byte a();
    }

    /* loaded from: classes2.dex */
    public static abstract class g extends i {
        @Override // com.fyber.inneractive.sdk.protobuf.i, java.lang.Iterable
        public Iterator<Byte> iterator() {
            return new a();
        }
    }

    /* loaded from: classes2.dex */
    public static class h extends g {
        private static final long serialVersionUID = 1;

        /* renamed from: d  reason: collision with root package name */
        public final byte[] f19889d;

        public h(byte[] bArr) {
            bArr.getClass();
            this.f19889d = bArr;
        }

        @Override // com.fyber.inneractive.sdk.protobuf.i
        public void a(byte[] bArr, int i10, int i11, int i12) {
            System.arraycopy(this.f19889d, i10, bArr, i11, i12);
        }

        @Override // com.fyber.inneractive.sdk.protobuf.i
        public final i b(int i10, int i11) {
            int a10 = i.a(i10, i11, size());
            if (a10 == 0) {
                return i.f19881b;
            }
            return new d(this.f19889d, j() + i10, a10);
        }

        @Override // com.fyber.inneractive.sdk.protobuf.i
        public byte c(int i10) {
            return this.f19889d[i10];
        }

        @Override // com.fyber.inneractive.sdk.protobuf.i
        public byte d(int i10) {
            return this.f19889d[i10];
        }

        @Override // com.fyber.inneractive.sdk.protobuf.i
        public final boolean e() {
            int j10 = j();
            return s1.b(this.f19889d, j10, size() + j10);
        }

        @Override // com.fyber.inneractive.sdk.protobuf.i
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if ((obj instanceof i) && size() == ((i) obj).size()) {
                if (size() == 0) {
                    return true;
                }
                if (obj instanceof h) {
                    h hVar = (h) obj;
                    int i10 = this.f19883a;
                    int i11 = hVar.f19883a;
                    if (i10 == 0 || i11 == 0 || i10 == i11) {
                        return a(hVar, 0, size());
                    }
                    return false;
                }
                return obj.equals(this);
            }
            return false;
        }

        @Override // com.fyber.inneractive.sdk.protobuf.i
        public final j g() {
            return j.a(this.f19889d, j(), size(), true);
        }

        public int j() {
            return 0;
        }

        @Override // com.fyber.inneractive.sdk.protobuf.i
        public int size() {
            return this.f19889d.length;
        }

        @Override // com.fyber.inneractive.sdk.protobuf.i
        public final void a(com.fyber.inneractive.sdk.protobuf.h hVar) throws IOException {
            hVar.a(this.f19889d, j(), size());
        }

        @Override // com.fyber.inneractive.sdk.protobuf.i
        public final String a(Charset charset) {
            return new String(this.f19889d, j(), size(), charset);
        }

        public final boolean a(i iVar, int i10, int i11) {
            if (i11 <= iVar.size()) {
                int i12 = i10 + i11;
                if (i12 <= iVar.size()) {
                    if (iVar instanceof h) {
                        h hVar = (h) iVar;
                        byte[] bArr = this.f19889d;
                        byte[] bArr2 = hVar.f19889d;
                        int j10 = j() + i11;
                        int j11 = j();
                        int j12 = hVar.j() + i10;
                        while (j11 < j10) {
                            if (bArr[j11] != bArr2[j12]) {
                                return false;
                            }
                            j11++;
                            j12++;
                        }
                        return true;
                    }
                    return iVar.b(i10, i12).equals(b(0, i11));
                }
                throw new IllegalArgumentException("Ran off end of other: " + i10 + ", " + i11 + ", " + iVar.size());
            }
            throw new IllegalArgumentException("Length too large: " + i11 + size());
        }

        @Override // com.fyber.inneractive.sdk.protobuf.i
        public final int b(int i10, int i11, int i12) {
            byte[] bArr = this.f19889d;
            int j10 = j() + i11;
            Charset charset = z.f20078a;
            for (int i13 = j10; i13 < j10 + i12; i13++) {
                i10 = (i10 * 31) + bArr[i13];
            }
            return i10;
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.protobuf.i$i  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0266i implements e {
        @Override // com.fyber.inneractive.sdk.protobuf.i.e
        public byte[] a(byte[] bArr, int i10, int i11) {
            byte[] bArr2 = new byte[i11];
            System.arraycopy(bArr, i10, bArr2, 0, i11);
            return bArr2;
        }
    }

    static {
        e cVar;
        if (com.fyber.inneractive.sdk.protobuf.d.a()) {
            cVar = new C0266i();
        } else {
            cVar = new c();
        }
        f19882c = cVar;
    }

    public static i a(byte[] bArr, int i10, int i11) {
        a(i10, i10 + i11, bArr.length);
        return new h(f19882c.a(bArr, i10, i11));
    }

    public abstract String a(Charset charset);

    public abstract void a(com.fyber.inneractive.sdk.protobuf.h hVar) throws IOException;

    public abstract void a(byte[] bArr, int i10, int i11, int i12);

    public abstract int b(int i10, int i11, int i12);

    public abstract i b(int i10, int i11);

    public abstract byte c(int i10);

    public abstract byte d(int i10);

    public abstract boolean e();

    public abstract boolean equals(Object obj);

    @Override // java.lang.Iterable
    /* renamed from: f */
    public f iterator() {
        return new a();
    }

    public abstract j g();

    public final byte[] h() {
        int size = size();
        if (size == 0) {
            return z.f20079b;
        }
        byte[] bArr = new byte[size];
        a(bArr, 0, 0, size);
        return bArr;
    }

    public final int hashCode() {
        int i10 = this.f19883a;
        if (i10 == 0) {
            int size = size();
            i10 = b(size, 0, size);
            if (i10 == 0) {
                i10 = 1;
            }
            this.f19883a = i10;
        }
        return i10;
    }

    public final String i() {
        return size() == 0 ? "" : a(z.f20078a);
    }

    public abstract int size();

    public final String toString() {
        String str;
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(size());
        if (size() <= 50) {
            str = k1.a(this);
        } else {
            str = k1.a(b(0, 47)) + "...";
        }
        objArr[2] = str;
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    public static i a(String str) {
        return new h(str.getBytes(z.f20078a));
    }

    public static void a(int i10, int i11) {
        if (((i11 - (i10 + 1)) | i10) < 0) {
            if (i10 < 0) {
                throw new ArrayIndexOutOfBoundsException("Index < 0: " + i10);
            }
            throw new ArrayIndexOutOfBoundsException("Index > length: " + i10 + ", " + i11);
        }
    }

    public static int a(int i10, int i11, int i12) {
        int i13 = i11 - i10;
        if ((i10 | i11 | i13 | (i12 - i11)) < 0) {
            if (i10 < 0) {
                throw new IndexOutOfBoundsException("Beginning index: " + i10 + " < 0");
            } else if (i11 < i10) {
                throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i10 + ", " + i11);
            } else {
                throw new IndexOutOfBoundsException("End index: " + i11 + " >= " + i12);
            }
        }
        return i13;
    }
}
