package com.fyber.inneractive.sdk.protobuf;

import com.fyber.inneractive.sdk.protobuf.a;
import com.fyber.inneractive.sdk.protobuf.a.AbstractC0264a;
import com.fyber.inneractive.sdk.protobuf.i;
import com.fyber.inneractive.sdk.protobuf.l;
import com.fyber.inneractive.sdk.protobuf.q0;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public abstract class a<MessageType extends a<MessageType, BuilderType>, BuilderType extends AbstractC0264a<MessageType, BuilderType>> implements q0 {
    public int memoizedHashCode = 0;

    @Deprecated
    public static <T> void addAll(Iterable<T> iterable, Collection<? super T> collection) {
        AbstractC0264a.a(iterable, (List) collection);
    }

    public static void checkByteStringIsUtf8(i iVar) throws IllegalArgumentException {
        if (!iVar.e()) {
            throw new IllegalArgumentException("Byte string is not UTF-8.");
        }
    }

    private String getSerializingExceptionMessage(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    public int getMemoizedSerializedSize() {
        throw new UnsupportedOperationException();
    }

    public int getSerializedSize(f1 f1Var) {
        int memoizedSerializedSize = getMemoizedSerializedSize();
        if (memoizedSerializedSize == -1) {
            int b10 = f1Var.b(this);
            setMemoizedSerializedSize(b10);
            return b10;
        }
        return memoizedSerializedSize;
    }

    public l1 newUninitializedMessageException() {
        return new l1();
    }

    public void setMemoizedSerializedSize(int i10) {
        throw new UnsupportedOperationException();
    }

    public byte[] toByteArray() {
        try {
            int serializedSize = getSerializedSize();
            byte[] bArr = new byte[serializedSize];
            Logger logger = l.f19945b;
            l.c cVar = new l.c(bArr, 0, serializedSize);
            writeTo(cVar);
            if (cVar.a() == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e10) {
            throw new RuntimeException(getSerializingExceptionMessage("byte array"), e10);
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.q0
    public i toByteString() {
        try {
            int serializedSize = getSerializedSize();
            i iVar = i.f19881b;
            byte[] bArr = new byte[serializedSize];
            l a10 = l.a(bArr);
            writeTo(a10);
            if (a10.a() == 0) {
                return new i.h(bArr);
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e10) {
            throw new RuntimeException(getSerializingExceptionMessage("ByteString"), e10);
        }
    }

    public void writeDelimitedTo(OutputStream outputStream) throws IOException {
        int serializedSize = getSerializedSize();
        int c10 = l.c(serializedSize) + serializedSize;
        if (c10 > 4096) {
            c10 = 4096;
        }
        l.e eVar = new l.e(outputStream, c10);
        eVar.g(serializedSize);
        writeTo(eVar);
        if (eVar.f19950f > 0) {
            eVar.b();
        }
    }

    public void writeTo(OutputStream outputStream) throws IOException {
        int serializedSize = getSerializedSize();
        Logger logger = l.f19945b;
        if (serializedSize > 4096) {
            serializedSize = 4096;
        }
        l.e eVar = new l.e(outputStream, serializedSize);
        writeTo(eVar);
        if (eVar.f19950f > 0) {
            eVar.b();
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.protobuf.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC0264a<MessageType extends a<MessageType, BuilderType>, BuilderType extends AbstractC0264a<MessageType, BuilderType>> implements q0.a {
        public static <T> void a(Iterable<T> iterable, List<? super T> list) {
            Charset charset = z.f20078a;
            iterable.getClass();
            if (iterable instanceof f0) {
                List<?> c10 = ((f0) iterable).c();
                f0 f0Var = (f0) list;
                int size = list.size();
                for (Object obj : c10) {
                    if (obj == null) {
                        String str = "Element at index " + (f0Var.size() - size) + " is null.";
                        for (int size2 = f0Var.size() - 1; size2 >= size; size2--) {
                            f0Var.remove(size2);
                        }
                        throw new NullPointerException(str);
                    } else if (obj instanceof i) {
                        f0Var.a((i) obj);
                    } else {
                        f0Var.add((String) obj);
                    }
                }
            } else if (iterable instanceof z0) {
                list.addAll((Collection) iterable);
            } else {
                if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                    ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
                }
                int size3 = list.size();
                for (T t10 : iterable) {
                    if (t10 == null) {
                        String str2 = "Element at index " + (list.size() - size3) + " is null.";
                        for (int size4 = list.size() - 1; size4 >= size3; size4--) {
                            list.remove(size4);
                        }
                        throw new NullPointerException(str2);
                    }
                    list.add(t10);
                }
            }
        }

        /* renamed from: com.fyber.inneractive.sdk.protobuf.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0265a extends FilterInputStream {

            /* renamed from: a  reason: collision with root package name */
            public int f19823a;

            public C0265a(InputStream inputStream, int i10) {
                super(inputStream);
                this.f19823a = i10;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int available() throws IOException {
                return Math.min(super.available(), this.f19823a);
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int read() throws IOException {
                if (this.f19823a <= 0) {
                    return -1;
                }
                int read = super.read();
                if (read >= 0) {
                    this.f19823a--;
                }
                return read;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public long skip(long j10) throws IOException {
                long skip = super.skip(Math.min(j10, this.f19823a));
                if (skip >= 0) {
                    this.f19823a = (int) (this.f19823a - skip);
                }
                return skip;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int read(byte[] bArr, int i10, int i11) throws IOException {
                int i12 = this.f19823a;
                if (i12 <= 0) {
                    return -1;
                }
                int read = super.read(bArr, i10, Math.min(i11, i12));
                if (read >= 0) {
                    this.f19823a -= read;
                }
                return read;
            }
        }
    }

    public static <T> void addAll(Iterable<T> iterable, List<? super T> list) {
        AbstractC0264a.a(iterable, list);
    }
}
