package com.facebook.ads.redexgen.X;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import com.facebook.ads.internal.exoplayer2.Format;
import com.facebook.ads.internal.exoplayer2.metadata.Metadata;
import java.util.Iterator;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class XF implements JN, BT, InterfaceC0946Gb, EJ, SurfaceHolder.Callback, TextureView.SurfaceTextureListener {
    public static String[] A01 = {"tENgV7sVRmCggStQb7ahqyncu3McMlqx", "EBCLDe86SI67l2WgLGk", "Xc2z6PWfFp", "ZjGJvfPpi7mMWyj8ThC73X2hXIQsvVeY", "O", "wm4K2NOZzdg8zteNHm", "uxR1U8t68FFaIgGW", "ZP1sAESULwb937k6ya35I8qp57tsUFN9"};
    public final /* synthetic */ C0889Ds A00;

    public XF(C0889Ds c0889Ds) {
        this.A00 = c0889Ds;
    }

    @Override // com.facebook.ads.redexgen.X.BT
    public final void AA4(String str, long j10, long j11) {
        Iterator it = C0889Ds.A0D(this.A00).iterator();
        while (it.hasNext()) {
            ((BT) it.next()).AA4(str, j10, j11);
        }
    }

    @Override // com.facebook.ads.redexgen.X.BT
    public final void AA5(C0855Bw c0855Bw) {
        Iterator it = C0889Ds.A0D(this.A00).iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            String[] strArr = A01;
            if (strArr[0].charAt(30) == strArr[7].charAt(30)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[4] = "r";
            strArr2[1] = "Pw7sEp82k0vieihjeRw";
            if (!hasNext) {
                C0889Ds c0889Ds = this.A00;
                String[] strArr3 = A01;
                if (strArr3[0].charAt(30) == strArr3[7].charAt(30)) {
                    throw new RuntimeException();
                }
                A01[5] = "AJXnTxM8Cjr";
                C0889Ds.A04(c0889Ds, null);
                C0889Ds.A06(this.A00, null);
                C0889Ds.A00(this.A00, 0);
                return;
            }
            BT bt = (BT) it.next();
            if (A01[3].charAt(20) != '3') {
                throw new RuntimeException();
            }
            A01[5] = "rZ";
            bt.AA5(c0855Bw);
        }
    }

    @Override // com.facebook.ads.redexgen.X.BT
    public final void AA6(C0855Bw c0855Bw) {
        C0889Ds.A06(this.A00, c0855Bw);
        Iterator it = C0889Ds.A0D(this.A00).iterator();
        while (it.hasNext()) {
            ((BT) it.next()).AA6(c0855Bw);
        }
    }

    @Override // com.facebook.ads.redexgen.X.BT
    public final void AA7(Format format) {
        C0889Ds.A04(this.A00, format);
        Iterator it = C0889Ds.A0D(this.A00).iterator();
        while (it.hasNext()) {
            ((BT) it.next()).AA7(format);
        }
    }

    @Override // com.facebook.ads.redexgen.X.BT
    public final void AA8(int i10) {
        C0889Ds.A00(this.A00, i10);
        Iterator it = C0889Ds.A0D(this.A00).iterator();
        while (it.hasNext()) {
            BT bt = (BT) it.next();
            if (A01[2].length() == 11) {
                throw new RuntimeException();
            }
            A01[2] = "0C";
            bt.AA8(i10);
        }
    }

    @Override // com.facebook.ads.redexgen.X.BT
    public final void AA9(int i10, long j10, long j11) {
        Iterator it = C0889Ds.A0D(this.A00).iterator();
        while (it.hasNext()) {
            ((BT) it.next()).AA9(i10, j10, j11);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0946Gb
    public final void AAS(List<GX> list) {
        C0889Ds.A08(this.A00, list);
        Iterator it = C0889Ds.A09(this.A00).iterator();
        while (it.hasNext()) {
            ((InterfaceC0946Gb) it.next()).AAS(list);
        }
    }

    @Override // com.facebook.ads.redexgen.X.JN
    public final void AAe(int i10, long j10) {
        Iterator it = C0889Ds.A0B(this.A00).iterator();
        while (it.hasNext()) {
            ((JN) it.next()).AAe(i10, j10);
        }
    }

    @Override // com.facebook.ads.redexgen.X.EJ
    public final void ABY(Metadata metadata) {
        Iterator it = C0889Ds.A0A(this.A00).iterator();
        while (it.hasNext()) {
            ((EJ) it.next()).ABY(metadata);
        }
    }

    @Override // com.facebook.ads.redexgen.X.JN
    public final void AC7(Surface surface) {
        if (C0889Ds.A01(this.A00) == surface) {
            Iterator it = C0889Ds.A0C(this.A00).iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
        Iterator it2 = C0889Ds.A0B(this.A00).iterator();
        while (it2.hasNext()) {
            ((JN) it2.next()).AC7(surface);
        }
    }

    @Override // com.facebook.ads.redexgen.X.JN
    public final void ACg(String str, long j10, long j11) {
        Iterator it = C0889Ds.A0B(this.A00).iterator();
        while (it.hasNext()) {
            ((JN) it.next()).ACg(str, j10, j11);
        }
    }

    @Override // com.facebook.ads.redexgen.X.JN
    public final void ACh(C0855Bw c0855Bw) {
        Iterator it = C0889Ds.A0B(this.A00).iterator();
        while (it.hasNext()) {
            ((JN) it.next()).ACh(c0855Bw);
        }
        C0889Ds.A03(this.A00, null);
        C0889Ds.A05(this.A00, null);
    }

    @Override // com.facebook.ads.redexgen.X.JN
    public final void ACi(C0855Bw c0855Bw) {
        C0889Ds.A05(this.A00, c0855Bw);
        Iterator it = C0889Ds.A0B(this.A00).iterator();
        while (it.hasNext()) {
            JN jn = (JN) it.next();
            if (A01[3].charAt(20) != '3') {
                throw new RuntimeException();
            }
            A01[5] = "6iGRC7";
            jn.ACi(c0855Bw);
        }
    }

    @Override // com.facebook.ads.redexgen.X.JN
    public final void ACl(Format format) {
        C0889Ds.A03(this.A00, format);
        Iterator it = C0889Ds.A0B(this.A00).iterator();
        while (it.hasNext()) {
            JN jn = (JN) it.next();
            String[] strArr = A01;
            if (strArr[0].charAt(30) == strArr[7].charAt(30)) {
                throw new RuntimeException();
            }
            A01[5] = "M1lNqMtLlEQhDRLPZV8vitTN6y5pnm";
            jn.ACl(format);
        }
    }

    @Override // com.facebook.ads.redexgen.X.JN
    public final void ACq(int i10, int i11, int i12, float f10) {
        Iterator it = C0889Ds.A0C(this.A00).iterator();
        while (it.hasNext()) {
            ((JE) it.next()).ACq(i10, i11, i12, f10);
        }
        Iterator it2 = C0889Ds.A0B(this.A00).iterator();
        while (it2.hasNext()) {
            ((JN) it2.next()).ACq(i10, i11, i12, f10);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        C0889Ds.A0H(this.A00, new Surface(surfaceTexture), true);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        C0889Ds.A0H(this.A00, null, true);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        C0889Ds.A0H(this.A00, surfaceHolder.getSurface(), false);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        C0889Ds.A0H(this.A00, null, false);
    }
}
