package k9;

import java.util.NoSuchElementException;

/* compiled from: MediaChunkIterator.java */
/* loaded from: classes2.dex */
public interface o {

    /* renamed from: a  reason: collision with root package name */
    public static final o f33437a = new a();

    /* compiled from: MediaChunkIterator.java */
    /* loaded from: classes2.dex */
    class a implements o {
        a() {
        }

        @Override // k9.o
        public long a() {
            throw new NoSuchElementException();
        }

        @Override // k9.o
        public long b() {
            throw new NoSuchElementException();
        }

        @Override // k9.o
        public boolean next() {
            return false;
        }
    }

    long a();

    long b();

    boolean next();
}
