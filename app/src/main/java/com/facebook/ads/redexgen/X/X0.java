package com.facebook.ads.redexgen.X;

import androidx.recyclerview.widget.RecyclerView;
import com.facebook.ads.redexgen.X.X1;
import com.facebook.ads.redexgen.X.X2;
import java.lang.Exception;
import java.util.ArrayDeque;

/* loaded from: assets/audience_network.dex */
public abstract class X0<I extends X2, O extends X1, E extends Exception> implements InterfaceC0854Bv<I, O, E> {
    public int A00;
    public int A01;
    public int A02;
    public I A03;
    public E A04;
    public boolean A05;
    public boolean A06;
    public final Thread A08;
    public final I[] A0B;
    public final O[] A0C;
    public final Object A07 = new Object();
    public final ArrayDeque<I> A09 = new ArrayDeque<>();
    public final ArrayDeque<O> A0A = new ArrayDeque<>();

    public abstract I A0T();

    public abstract O A0V();

    public abstract E A0W(I i10, O o10, boolean z10);

    public abstract E A0X(Throwable th);

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.X0 != com.facebook.ads.internal.exoplayer2.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.X2, O extends com.facebook.ads.redexgen.X.X1, E extends java.lang.Exception> */
    public X0(I[] iArr, O[] oArr) {
        this.A0B = iArr;
        this.A00 = iArr.length;
        for (int i10 = 0; i10 < this.A00; i10++) {
            this.A0B[i10] = A0T();
        }
        this.A0C = oArr;
        this.A01 = oArr.length;
        for (int i11 = 0; i11 < this.A01; i11++) {
            this.A0C[i11] = A0V();
        }
        this.A08 = new C0857By(this);
        this.A08.start();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.X0 != com.facebook.ads.internal.exoplayer2.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.X2, O extends com.facebook.ads.redexgen.X.X1, E extends java.lang.Exception> */
    private void A0K() {
        if (A0Q()) {
            this.A07.notify();
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.X0 != com.facebook.ads.internal.exoplayer2.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.X2, O extends com.facebook.ads.redexgen.X.X1, E extends java.lang.Exception> */
    private void A0L() throws Exception {
        E e10 = this.A04;
        if (e10 == null) {
            return;
        }
        throw e10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.X0 != com.facebook.ads.internal.exoplayer2.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.X2, O extends com.facebook.ads.redexgen.X.X1, E extends java.lang.Exception> */
    public void A0M() {
        while (A0R()) {
            try {
            } catch (InterruptedException e10) {
                throw new IllegalStateException(e10);
            }
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.X0 != com.facebook.ads.internal.exoplayer2.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.X2, O extends com.facebook.ads.redexgen.X.X1, E extends java.lang.Exception> */
    private void A0N(I i10) {
        i10.A07();
        I[] iArr = this.A0B;
        int i11 = this.A00;
        this.A00 = i11 + 1;
        iArr[i11] = i10;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.X0 != com.facebook.ads.internal.exoplayer2.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.X2, O extends com.facebook.ads.redexgen.X.X1, E extends java.lang.Exception> */
    private void A0O(O o10) {
        o10.A07();
        O[] oArr = this.A0C;
        int i10 = this.A01;
        this.A01 = i10 + 1;
        oArr[i10] = o10;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.X0 != com.facebook.ads.internal.exoplayer2.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.X2, O extends com.facebook.ads.redexgen.X.X1, E extends java.lang.Exception> */
    private boolean A0Q() {
        return !this.A09.isEmpty() && this.A01 > 0;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.X0 != com.facebook.ads.internal.exoplayer2.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.X2, O extends com.facebook.ads.redexgen.X.X1, E extends java.lang.Exception> */
    private boolean A0R() throws InterruptedException {
        synchronized (this.A07) {
            while (!this.A06 && !A0Q()) {
                this.A07.wait();
            }
            if (this.A06) {
                return false;
            }
            I removeFirst = this.A09.removeFirst();
            O[] oArr = this.A0C;
            int i10 = this.A01 - 1;
            this.A01 = i10;
            O o10 = oArr[i10];
            boolean z10 = this.A05;
            this.A05 = false;
            boolean resetDecoder = removeFirst.A04();
            if (resetDecoder) {
                o10.A00(4);
            } else {
                boolean resetDecoder2 = removeFirst.A03();
                if (resetDecoder2) {
                    o10.A00(RecyclerView.UNDEFINED_DURATION);
                }
                try {
                    this.A04 = A0W(removeFirst, o10, z10);
                } catch (OutOfMemoryError e10) {
                    this.A04 = A0X(e10);
                } catch (RuntimeException e11) {
                    this.A04 = A0X(e11);
                }
                if (this.A04 != null) {
                    synchronized (this.A07) {
                    }
                    return false;
                }
            }
            synchronized (this.A07) {
                boolean resetDecoder3 = this.A05;
                if (resetDecoder3) {
                    A0O(o10);
                } else {
                    boolean resetDecoder4 = o10.A03();
                    if (resetDecoder4) {
                        this.A02++;
                        A0O(o10);
                    } else {
                        o10.A00 = this.A02;
                        this.A02 = 0;
                        this.A0A.addLast(o10);
                    }
                }
                A0N(removeFirst);
            }
            return true;
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.X0 != com.facebook.ads.internal.exoplayer2.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.X2, O extends com.facebook.ads.redexgen.X.X1, E extends java.lang.Exception> */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0854Bv
    /* renamed from: A0S */
    public final I A4k() throws Exception {
        I i10;
        I i11;
        synchronized (this.A07) {
            A0L();
            IK.A04(this.A03 == null);
            if (this.A00 == 0) {
                i10 = null;
            } else {
                I[] iArr = this.A0B;
                int i12 = this.A00 - 1;
                this.A00 = i12;
                i10 = iArr[i12];
            }
            this.A03 = i10;
            i11 = this.A03;
        }
        return i11;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.X0 != com.facebook.ads.internal.exoplayer2.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.X2, O extends com.facebook.ads.redexgen.X.X1, E extends java.lang.Exception> */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0854Bv
    /* renamed from: A0U */
    public final O A4l() throws Exception {
        synchronized (this.A07) {
            A0L();
            if (this.A0A.isEmpty()) {
                return null;
            }
            return this.A0A.removeFirst();
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.X0 != com.facebook.ads.internal.exoplayer2.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.X2, O extends com.facebook.ads.redexgen.X.X1, E extends java.lang.Exception> */
    public final void A0Y(int i10) {
        I[] iArr;
        IK.A04(this.A00 == this.A0B.length);
        for (I inputBuffer : this.A0B) {
            inputBuffer.A09(i10);
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.X0 != com.facebook.ads.internal.exoplayer2.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.X2, O extends com.facebook.ads.redexgen.X.X1, E extends java.lang.Exception> */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0854Bv
    /* renamed from: A0Z */
    public final void ADW(I i10) throws Exception {
        synchronized (this.A07) {
            A0L();
            I inputBuffer = this.A03;
            IK.A03(i10 == inputBuffer);
            this.A09.addLast(i10);
            A0K();
            this.A03 = null;
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.X0 != com.facebook.ads.internal.exoplayer2.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.X2, O extends com.facebook.ads.redexgen.X.X1, E extends java.lang.Exception> */
    public void A0a(O o10) {
        synchronized (this.A07) {
            A0O(o10);
            A0K();
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.X0 != com.facebook.ads.internal.exoplayer2.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.X2, O extends com.facebook.ads.redexgen.X.X1, E extends java.lang.Exception> */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0854Bv
    public final void ADm() {
        synchronized (this.A07) {
            this.A06 = true;
            this.A07.notify();
        }
        try {
            this.A08.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.X0 != com.facebook.ads.internal.exoplayer2.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.X2, O extends com.facebook.ads.redexgen.X.X1, E extends java.lang.Exception> */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0854Bv
    public final void flush() {
        synchronized (this.A07) {
            this.A05 = true;
            this.A02 = 0;
            if (this.A03 != null) {
                A0N(this.A03);
                this.A03 = null;
            }
            while (!this.A09.isEmpty()) {
                A0N(this.A09.removeFirst());
            }
            while (!this.A0A.isEmpty()) {
                A0O(this.A0A.removeFirst());
            }
        }
    }
}
