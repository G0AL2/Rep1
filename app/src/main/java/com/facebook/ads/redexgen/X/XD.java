package com.facebook.ads.redexgen.X;

import android.view.Surface;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.exoplayer2.Format;
import com.facebook.ads.internal.exoplayer2.metadata.Metadata;
import com.facebook.ads.internal.exoplayer2.source.TrackGroupArray;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: assets/audience_network.dex */
public final class XD implements InterfaceC0818Ak, EJ, BT, JN, InterfaceC0933Fo, HY, CA {
    public static String[] A05 = {"oWxliEG", "84CCzfJSWHAMzlT", "dVPYU5AFfnLld9", "202VfNqPV04zLFr42xUQnFXcv", "6C2OHs0d6U2aNpx0mThNdUqCMJf7H", "j36hHuSQknS9Y2BeP2DWP06EygcBzL55", "WN9koNHhTr4SbLKtJDKTY2JTPC", "f2Eog"};
    public InterfaceC0823Ap A00;
    public final IN A03;
    public final CopyOnWriteArraySet<B6> A04 = new CopyOnWriteArraySet<>();
    public final B3 A02 = new B3();
    public final B0 A01 = new B0();

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.X.HY
    public final void AAB(int i10, long j10, long j11) {
        A01();
        Iterator<B6> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public XD(@Nullable InterfaceC0823Ap interfaceC0823Ap, IN in) {
        this.A00 = interfaceC0823Ap;
        this.A03 = (IN) IK.A01(in);
    }

    private B5 A00() {
        return A05(this.A02.A03());
    }

    private B5 A01() {
        return A05(this.A02.A04());
    }

    private B5 A02() {
        return A05(this.A02.A05());
    }

    private B5 A03() {
        return A05(this.A02.A06());
    }

    private final B5 A04(int i10, @Nullable FY fy) {
        long j10;
        IK.A01(this.A00);
        long A58 = this.A03.A58();
        B1 timeline = this.A00.A6H();
        if (i10 == this.A00.A6I()) {
            if (fy != null && fy.A01()) {
                if (this.A00.A6C() == fy.A00 && this.A00.A6D() == fy.A01) {
                    j10 = this.A00.A6F();
                } else {
                    j10 = 0;
                }
            } else {
                j10 = this.A00.A6A();
            }
        } else if (i10 >= timeline.A01() || (fy != null && fy.A01())) {
            j10 = 0;
        } else {
            j10 = timeline.A0B(i10, this.A01).A00();
        }
        return new B5(A58, timeline, i10, fy, j10, this.A00.A6F(), this.A00.A5s() - this.A00.A6A());
    }

    private B5 A05(@Nullable B4 b42) {
        if (b42 == null) {
            int A6I = ((InterfaceC0823Ap) IK.A01(this.A00)).A6I();
            return A04(A6I, this.A02.A07(A6I));
        }
        return A04(b42.A00, b42.A01);
    }

    public final void A06() {
        if (!this.A02.A0F()) {
            B5 A02 = A02();
            this.A02.A09();
            Iterator<B6> it = this.A04.iterator();
            while (it.hasNext()) {
                B6 next = it.next();
                String[] strArr = A05;
                if (strArr[1].length() == strArr[4].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A05;
                strArr2[1] = "PBkwxeOlbvYzAOz";
                strArr2[4] = "zMCnce58Qhbdr93RoMzV7EOLVlkYq";
                next.onSeekStarted(A02);
            }
        }
    }

    public final void A07() {
        ArrayList arrayList;
        arrayList = this.A02.A05;
        Iterator it = new ArrayList(arrayList).iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            String[] strArr = A05;
            if (strArr[1].length() == strArr[4].length()) {
                throw new RuntimeException();
            }
            A05[0] = "gG2PlvUwOW39eC8R";
            if (hasNext) {
                B4 b42 = (B4) it.next();
                ABV(b42.A00, b42.A01);
            } else {
                return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.BT
    public final void AA4(String str, long j10, long j11) {
        B5 eventTime = A03();
        Iterator<B6> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onDecoderInitialized(eventTime, 1, str, j11);
        }
    }

    @Override // com.facebook.ads.redexgen.X.BT
    public final void AA5(C0855Bw c0855Bw) {
        B5 A00 = A00();
        Iterator<B6> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onDecoderDisabled(A00, 1, c0855Bw);
        }
    }

    @Override // com.facebook.ads.redexgen.X.BT
    public final void AA6(C0855Bw c0855Bw) {
        B5 A02 = A02();
        Iterator<B6> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onDecoderEnabled(A02, 1, c0855Bw);
        }
    }

    @Override // com.facebook.ads.redexgen.X.BT
    public final void AA7(Format format) {
        B5 A03 = A03();
        Iterator<B6> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onDecoderInputFormatChanged(A03, 1, format);
        }
    }

    @Override // com.facebook.ads.redexgen.X.BT
    public final void AA8(int i10) {
        B5 A03 = A03();
        Iterator<B6> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onAudioSessionId(A03, i10);
        }
    }

    @Override // com.facebook.ads.redexgen.X.BT
    public final void AA9(int i10, long j10, long j11) {
        B5 A03 = A03();
        Iterator<B6> it = this.A04.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            if (A05[2].length() == 13) {
                throw new RuntimeException();
            }
            String[] strArr = A05;
            strArr[1] = "uqo4gq1KBxiMktN";
            strArr[4] = "Ndm2ibG2UK8Su1apjnSt0jhcojAUZ";
            if (hasNext) {
                it.next().onAudioUnderrun(A03, i10, j10, j11);
            } else {
                return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0933Fo
    public final void AAZ(int i10, @Nullable FY fy, C0932Fn c0932Fn) {
        B5 A04 = A04(i10, fy);
        Iterator<B6> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onDownstreamFormatChanged(A04, c0932Fn);
        }
    }

    @Override // com.facebook.ads.redexgen.X.CA
    public final void AAa() {
        B5 A03 = A03();
        Iterator<B6> it = this.A04.iterator();
        while (it.hasNext()) {
            B6 listener = it.next();
            listener.onDrmKeysLoaded(A03);
        }
    }

    @Override // com.facebook.ads.redexgen.X.CA
    public final void AAb() {
        B5 A03 = A03();
        Iterator<B6> it = this.A04.iterator();
        while (it.hasNext()) {
            B6 listener = it.next();
            listener.onDrmKeysRemoved(A03);
        }
    }

    @Override // com.facebook.ads.redexgen.X.CA
    public final void AAc() {
        B5 A03 = A03();
        Iterator<B6> it = this.A04.iterator();
        while (it.hasNext()) {
            B6 listener = it.next();
            listener.onDrmKeysRestored(A03);
        }
    }

    @Override // com.facebook.ads.redexgen.X.CA
    public final void AAd(Exception exc) {
        B5 A03 = A03();
        Iterator<B6> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onDrmSessionManagerError(A03, exc);
        }
    }

    @Override // com.facebook.ads.redexgen.X.JN
    public final void AAe(int i10, long j10) {
        B5 A00 = A00();
        Iterator<B6> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onDroppedVideoFrames(A00, i10, j10);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0933Fo
    public final void ABE(int i10, @Nullable FY fy, C0931Fm c0931Fm, C0932Fn c0932Fn) {
        A04(i10, fy);
        Iterator<B6> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0933Fo
    public final void ABG(int i10, @Nullable FY fy, C0931Fm c0931Fm, C0932Fn c0932Fn) {
        A04(i10, fy);
        Iterator<B6> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0933Fo
    public final void ABJ(int i10, @Nullable FY fy, C0931Fm c0931Fm, C0932Fn c0932Fn, IOException iOException, boolean z10) {
        B5 A04 = A04(i10, fy);
        Iterator<B6> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onLoadError(A04, c0931Fm, c0932Fn, iOException, z10);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0933Fo
    public final void ABL(int i10, @Nullable FY fy, C0931Fm c0931Fm, C0932Fn c0932Fn) {
        A04(i10, fy);
        Iterator<B6> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0818Ak
    public final void ABN(boolean z10) {
        B5 A02 = A02();
        Iterator<B6> it = this.A04.iterator();
        while (it.hasNext()) {
            B6 next = it.next();
            if (A05[2].length() == 13) {
                throw new RuntimeException();
            }
            A05[5] = "61iKEbH7Elk598B8IvoVeyiFcghmzjBq";
            next.onLoadingChanged(A02, z10);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0933Fo
    public final void ABU(int i10, FY fy) {
        this.A02.A0B(i10, fy);
        B5 A04 = A04(i10, fy);
        Iterator<B6> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onMediaPeriodCreated(A04);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0933Fo
    public final void ABV(int i10, FY fy) {
        this.A02.A0C(i10, fy);
        B5 A04 = A04(i10, fy);
        Iterator<B6> it = this.A04.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            String[] strArr = A05;
            if (strArr[7].length() == strArr[6].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A05;
            strArr2[1] = "xQuAJnMHmsnkUtn";
            strArr2[4] = "I7nuhInD03G6TyFgZN1tEp7XA66Po";
            if (hasNext) {
                it.next().onMediaPeriodReleased(A04);
            } else {
                return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.EJ
    public final void ABY(Metadata metadata) {
        B5 A02 = A02();
        Iterator<B6> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onMetadata(A02, metadata);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0818Ak
    public final void ABo(C0815Ah c0815Ah) {
        B5 A02 = A02();
        Iterator<B6> it = this.A04.iterator();
        while (it.hasNext()) {
            B6 next = it.next();
            if (A05[5].charAt(25) != 'g') {
                throw new RuntimeException();
            }
            A05[5] = "6kCd761y4Sm0JC2HIy7vlDu4Zge9adCZ";
            next.onPlaybackParametersChanged(A02, c0815Ah);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0818Ak
    public final void ABq(AM am) {
        B5 A02 = A02();
        Iterator<B6> it = this.A04.iterator();
        while (it.hasNext()) {
            B6 next = it.next();
            String[] strArr = A05;
            if (strArr[7].length() == strArr[6].length()) {
                throw new RuntimeException();
            }
            A05[3] = "4uLQlqFUz3TKu9PUP8Ua0";
            next.onPlayerError(A02, am);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0818Ak
    public final void ABs(boolean z10, int i10) {
        B5 A02 = A02();
        Iterator<B6> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onPlayerStateChanged(A02, z10, i10);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0818Ak
    public final void ABu(int i10) {
        this.A02.A0A(i10);
        B5 A02 = A02();
        Iterator<B6> it = this.A04.iterator();
        while (it.hasNext()) {
            B6 listener = it.next();
            listener.onPositionDiscontinuity(A02, i10);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0933Fo
    public final void AC3(int i10, FY fy) {
        this.A02.A0D(i10, fy);
        B5 A04 = A04(i10, fy);
        Iterator<B6> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onReadingStarted(A04);
        }
    }

    @Override // com.facebook.ads.redexgen.X.JN
    public final void AC7(Surface surface) {
        B5 A03 = A03();
        Iterator<B6> it = this.A04.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            String[] strArr = A05;
            if (strArr[1].length() == strArr[4].length()) {
                throw new RuntimeException();
            }
            A05[0] = "zEYrHw08cBp169ZitgaAlaUGutwvX";
            if (hasNext) {
                it.next().onRenderedFirstFrame(A03, surface);
            } else {
                return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0818Ak
    public final void ACH() {
        if (this.A02.A0F()) {
            this.A02.A08();
            B5 A02 = A02();
            Iterator<B6> it = this.A04.iterator();
            while (it.hasNext()) {
                B6 listener = it.next();
                listener.onSeekProcessed(A02);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0818Ak
    public final void ACW(B1 b12, @Nullable Object obj, int i10) {
        this.A02.A0E(b12);
        B5 A02 = A02();
        Iterator<B6> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onTimelineChanged(A02, i10);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0818Ak
    public final void ACY(TrackGroupArray trackGroupArray, HR hr) {
        B5 A02 = A02();
        Iterator<B6> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onTracksChanged(A02, trackGroupArray, hr);
        }
    }

    @Override // com.facebook.ads.redexgen.X.JN
    public final void ACg(String str, long j10, long j11) {
        B5 eventTime = A03();
        Iterator<B6> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onDecoderInitialized(eventTime, 2, str, j11);
        }
    }

    @Override // com.facebook.ads.redexgen.X.JN
    public final void ACh(C0855Bw c0855Bw) {
        B5 A00 = A00();
        Iterator<B6> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onDecoderDisabled(A00, 2, c0855Bw);
        }
    }

    @Override // com.facebook.ads.redexgen.X.JN
    public final void ACi(C0855Bw c0855Bw) {
        B5 A02 = A02();
        Iterator<B6> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onDecoderEnabled(A02, 2, c0855Bw);
        }
    }

    @Override // com.facebook.ads.redexgen.X.JN
    public final void ACl(Format format) {
        B5 A03 = A03();
        Iterator<B6> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onDecoderInputFormatChanged(A03, 2, format);
        }
    }

    @Override // com.facebook.ads.redexgen.X.JN
    public final void ACq(int i10, int i11, int i12, float f10) {
        B5 A03 = A03();
        Iterator<B6> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onVideoSizeChanged(A03, i10, i11, i12, f10);
        }
    }
}
