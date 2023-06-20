package n0;

import java.nio.ByteBuffer;

/* compiled from: Table.java */
/* loaded from: classes.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    protected int f34596a;

    /* renamed from: b  reason: collision with root package name */
    protected ByteBuffer f34597b;

    /* renamed from: c  reason: collision with root package name */
    private int f34598c;

    /* renamed from: d  reason: collision with root package name */
    private int f34599d;

    public c() {
        d.a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int a(int i10) {
        return i10 + this.f34597b.getInt(i10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int b(int i10) {
        if (i10 < this.f34599d) {
            return this.f34597b.getShort(this.f34598c + i10);
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void c(int i10, ByteBuffer byteBuffer) {
        this.f34597b = byteBuffer;
        if (byteBuffer != null) {
            this.f34596a = i10;
            int i11 = i10 - byteBuffer.getInt(i10);
            this.f34598c = i11;
            this.f34599d = this.f34597b.getShort(i11);
            return;
        }
        this.f34596a = 0;
        this.f34598c = 0;
        this.f34599d = 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int d(int i10) {
        int i11 = i10 + this.f34596a;
        return i11 + this.f34597b.getInt(i11) + 4;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int e(int i10) {
        int i11 = i10 + this.f34596a;
        return this.f34597b.getInt(i11 + this.f34597b.getInt(i11));
    }
}
