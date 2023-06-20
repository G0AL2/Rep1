package r2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* compiled from: ByteArrayPool.java */
/* loaded from: classes.dex */
public class d {

    /* renamed from: e  reason: collision with root package name */
    protected static final Comparator<byte[]> f36127e = new a();

    /* renamed from: a  reason: collision with root package name */
    private final List<byte[]> f36128a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    private final List<byte[]> f36129b = new ArrayList(64);

    /* renamed from: c  reason: collision with root package name */
    private int f36130c = 0;

    /* renamed from: d  reason: collision with root package name */
    private final int f36131d;

    /* compiled from: ByteArrayPool.java */
    /* loaded from: classes.dex */
    class a implements Comparator<byte[]> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(byte[] bArr, byte[] bArr2) {
            return bArr.length - bArr2.length;
        }
    }

    public d(int i10) {
        this.f36131d = i10;
    }

    private synchronized void c() {
        while (this.f36130c > this.f36131d) {
            byte[] remove = this.f36128a.remove(0);
            this.f36129b.remove(remove);
            this.f36130c -= remove.length;
        }
    }

    public synchronized byte[] a(int i10) {
        for (int i11 = 0; i11 < this.f36129b.size(); i11++) {
            byte[] bArr = this.f36129b.get(i11);
            if (bArr.length >= i10) {
                this.f36130c -= bArr.length;
                this.f36129b.remove(i11);
                this.f36128a.remove(bArr);
                return bArr;
            }
        }
        return new byte[i10];
    }

    public synchronized void b(byte[] bArr) {
        if (bArr != null) {
            if (bArr.length <= this.f36131d) {
                this.f36128a.add(bArr);
                int binarySearch = Collections.binarySearch(this.f36129b, bArr, f36127e);
                if (binarySearch < 0) {
                    binarySearch = (-binarySearch) - 1;
                }
                this.f36129b.add(binarySearch, bArr);
                this.f36130c += bArr.length;
                c();
            }
        }
    }
}
