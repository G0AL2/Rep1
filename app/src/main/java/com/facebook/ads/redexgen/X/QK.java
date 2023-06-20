package com.facebook.ads.redexgen.X;

import android.net.Uri;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public class QK extends RelativeLayout implements InterfaceC1218Qu, InterfaceC1197Pz, InterfaceC1216Qs {
    public static byte[] A0E;
    public static String[] A0F = {"bTF0mPynjITMPKd7AWnGFE0wjuUHqGk", "NLuteA0O4hImypGMVaagZ7KROvpQko", "vHIsSgA1dNPe0TxNLDw8T5r", "Tu3OEd7", "fTm", "FLX2LFKD3Z9kyRG7iyj3Ajj18EKg1", "ES7oyLysdjBWPeOJZDQ9P8Sn", "e8"};
    public static final N5 A0G;
    public static final C1092Ly A0H;
    public static final LG A0I;
    public static final C1064Ku A0J;
    public static final C1062Kr A0K;
    public static final C1050Kd A0L;
    public static final C1048Kb A0M;
    public static final C1047Ka A0N;
    public int A00;
    public C1036Jp A01;
    public Q3 A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public final Handler A07;
    public final Handler A08;
    public final View.OnTouchListener A09;
    public final C1400Xy A0A;
    public final C07849b<AbstractC07859c, C07839a> A0B;
    public final List<Q7> A0C;
    public final InterfaceC1215Qr A0D;

    public static String A0F(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0E, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 103);
        }
        return new String(copyOfRange);
    }

    public static void A0I() {
        byte[] bArr = {4, 87, 73, 71, 4, 88, 83, 88, 69, 80, 4, 91, 69, 88, 71, 76, 4, 88, 77, 81, 73, 38, 88, 85, 85, 72, 81, 87, 79, 92, 3, 68, 87, 3};
        if (A0F[6].length() != 24) {
            throw new RuntimeException();
        }
        String[] strArr = A0F;
        strArr[5] = "dnbQEbQJ0095hjHrUlDt4BBpkj0Wp";
        strArr[7] = "GI";
        A0E = bArr;
    }

    static {
        A0I();
        A0I = new LG();
        A0G = new N5();
        A0J = new C1064Ku();
        A0K = new C1062Kr();
        A0H = new C1092Ly();
        A0L = new C1050Kd();
        A0N = new C1047Ka();
        A0M = new C1048Kb();
    }

    public QK(C1400Xy c1400Xy) {
        super(c1400Xy);
        this.A0C = new ArrayList();
        this.A07 = new Handler();
        this.A08 = new Handler();
        this.A0B = new C07849b<>();
        this.A05 = true;
        this.A00 = 200;
        this.A09 = new View$OnTouchListenerC1196Py(this);
        this.A0A = c1400Xy;
        if (A0S(c1400Xy)) {
            this.A0D = new I7(c1400Xy);
        } else {
            this.A0D = new I5(c1400Xy);
        }
        A0G();
    }

    public QK(C1400Xy c1400Xy, AttributeSet attributeSet) {
        super(c1400Xy, attributeSet);
        this.A0C = new ArrayList();
        this.A07 = new Handler();
        this.A08 = new Handler();
        this.A0B = new C07849b<>();
        this.A05 = true;
        this.A00 = 200;
        this.A09 = new View$OnTouchListenerC1196Py(this);
        this.A0A = c1400Xy;
        if (A0S(c1400Xy)) {
            this.A0D = new I7(c1400Xy, attributeSet);
        } else {
            this.A0D = new I5(c1400Xy, attributeSet);
        }
        A0G();
    }

    public QK(C1400Xy c1400Xy, AttributeSet attributeSet, int i10) {
        super(c1400Xy, attributeSet, i10);
        this.A0C = new ArrayList();
        this.A07 = new Handler();
        this.A08 = new Handler();
        this.A0B = new C07849b<>();
        this.A05 = true;
        this.A00 = 200;
        this.A09 = new View$OnTouchListenerC1196Py(this);
        this.A0A = c1400Xy;
        if (A0S(c1400Xy)) {
            this.A0D = new I7(c1400Xy, attributeSet, i10);
        } else {
            this.A0D = new I5(c1400Xy, attributeSet, i10);
        }
        A0G();
    }

    public static /* synthetic */ LG A0C() {
        LG lg = A0I;
        if (A0F[0].length() != 31) {
            throw new RuntimeException();
        }
        A0F[6] = "XnBln0F0zo0j2g49JSScdoR2";
        return lg;
    }

    private void A0G() {
        this.A06 = JR.A0m(this.A0A);
        this.A0A.A0D().A2q();
        this.A0D.setRequestedVolume(1.0f);
        this.A0D.setVideoStateChangeListener(this);
        this.A02 = new Q3(this.A0A, this.A0D);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        addView(this.A02, layoutParams);
        setOnTouchListener(this.A09);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0H() {
        this.A07.postDelayed(new C1235Rl(this), this.A00);
    }

    private final void A0J() {
        for (Q7 plugin : this.A0C) {
            if (plugin instanceof NQ) {
                A0Q((NQ) plugin);
            }
            plugin.A8o(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0K(int i10) {
        if (JR.A0p(this.A0A)) {
            C1400Xy c1400Xy = this.A0A;
            Toast.makeText(c1400Xy, A0F(21, 13, 124) + (i10 / 1000.0f) + A0F(0, 21, 125), 1).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0L(EnumC1035Jo enumC1035Jo) {
        C1036Jp c1036Jp = this.A01;
        if (c1036Jp == null) {
            return;
        }
        c1036Jp.A02(enumC1035Jo, null);
    }

    private void A0P(Q7 q72) {
        if (q72 instanceof NQ) {
            A0R((NQ) q72);
        }
        q72.AFG(this);
    }

    private void A0Q(NQ nq) {
        if (nq.getParent() == null) {
            if (nq instanceof C07517m) {
                this.A02.A00(nq);
            } else {
                addView(nq);
            }
        }
    }

    private void A0R(NQ nq) {
        if (nq instanceof C07517m) {
            this.A02.A01(nq);
        } else {
            MS.A0J(nq);
        }
    }

    private boolean A0S(C1400Xy c1400Xy) {
        return JR.A28(c1400Xy, C1204Qg.A03());
    }

    public final void A0V() {
        this.A0D.setVideoStateChangeListener(null);
        this.A0D.destroy();
    }

    public final void A0W() {
        if (A0i()) {
            return;
        }
        this.A0D.A7u();
    }

    public final void A0X() {
        Iterator<Q7> it = this.A0C.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            if (A0F[0].length() != 31) {
                throw new RuntimeException();
            }
            A0F[0] = "GYUlZXdJo7nruMh2UHaMalRUd7rYm0D";
            if (hasNext) {
                Q7 plugin = it.next();
                A0P(plugin);
            } else {
                this.A0C.clear();
                String[] strArr = A0F;
                if (strArr[4].length() != strArr[3].length()) {
                    String[] strArr2 = A0F;
                    strArr2[4] = "dBG";
                    strArr2[3] = "pEPub8w";
                    return;
                }
                return;
            }
        }
    }

    public final void A0Y(int i10) {
        this.A07.removeCallbacksAndMessages(null);
        this.A0D.seekTo(i10);
    }

    public final void A0Z(int i10) {
        this.A0D.AF3(i10);
    }

    public final void A0a(Q1 q12) {
        QM qm = new QM(this);
        if (this.A06) {
            MM.A00(qm);
        } else {
            Handler handler = this.A08;
            if (A0F[6].length() != 24) {
                throw new RuntimeException();
            }
            A0F[6] = "kK0l9LoMdPIpLA2D0gOeof4W";
            handler.post(qm);
        }
        this.A0D.AEr(q12.A02());
    }

    public final void A0b(Q6 q62, int i10) {
        if (this.A03 && this.A0D.getState() == EnumC1217Qt.A06) {
            this.A03 = false;
        }
        this.A0D.AEw(q62, i10);
    }

    public final void A0c(Q7 q72) {
        this.A0C.add(q72);
    }

    public final void A0d(Q7 q72) {
        this.A0C.remove(q72);
        A0P(q72);
    }

    public final void A0e(boolean z10, int i10) {
        if (A0i()) {
            return;
        }
        this.A0D.AD5(z10, i10);
    }

    public final void A0f(boolean z10, boolean z11, int i10) {
        this.A05 = z11;
        A0e(z10, i10);
    }

    public final boolean A0g() {
        return this.A0D.A85();
    }

    public final boolean A0h() {
        return getVolume() == 0.0f;
    }

    public final boolean A0i() {
        return getState() == EnumC1217Qt.A05;
    }

    public final boolean A0j() {
        return A0i() && this.A0D.A8b();
    }

    public final boolean A0k() {
        return getState() == EnumC1217Qt.A0A;
    }

    public final boolean A0l() {
        return this.A06;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1197Pz
    public final boolean A8T() {
        return A0S(this.A0A);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1197Pz
    public final boolean A8W() {
        return this.A04;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1218Qu
    public final void AAq(long j10, long j11, long j12, float f10) {
        if (!JR.A1J(this.A0A)) {
            return;
        }
        this.A0B.A02(new NF(j10, j11, j12, f10) { // from class: com.facebook.ads.redexgen.X.86
        });
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1218Qu
    public final void ABR() {
        A0e(true, 4);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1218Qu
    public final void ABS() {
        A0b(Q6.A04, 6);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1218Qu
    public final void ACG(int i10, int i11) {
        QN qn = new QN(this, i10, i11);
        if (this.A06) {
            MM.A00(qn);
        } else {
            this.A08.post(qn);
        }
        A0H();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1218Qu
    public final void ACs(EnumC1217Qt enumC1217Qt) {
        C1223Qz c1223Qz = new C1223Qz(this, enumC1217Qt, getCurrentPositionInMillis(), getDuration());
        if (this.A06) {
            MM.A00(c1223Qz);
        } else {
            this.A08.post(c1223Qz);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1197Pz
    public int getCurrentPositionInMillis() {
        return this.A0D.getCurrentPosition();
    }

    public int getDuration() {
        return this.A0D.getDuration();
    }

    @NonNull
    public C07849b<AbstractC07859c, C07839a> getEventBus() {
        return this.A0B;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1197Pz
    public long getInitialBufferTime() {
        return this.A0D.getInitialBufferTime();
    }

    public EnumC1217Qt getState() {
        return this.A0D.getState();
    }

    public Handler getStateHandler() {
        return this.A08;
    }

    public TextureView getTextureView() {
        return (TextureView) this.A0D;
    }

    public int getVideoHeight() {
        return this.A0D.getVideoHeight();
    }

    public int getVideoProgressReportIntervalMs() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1197Pz
    public Q6 getVideoStartReason() {
        return this.A0D.getStartReason();
    }

    public View getVideoView() {
        return this.A02;
    }

    public int getVideoWidth() {
        return this.A0D.getVideoWidth();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1197Pz
    public float getVolume() {
        return this.A0D.getVolume();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        this.A0B.A02(A0M);
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.A0B.A02(A0N);
        super.onDetachedFromWindow();
    }

    public void setControlsAnchorView(View view) {
        InterfaceC1215Qr interfaceC1215Qr = this.A0D;
        if (interfaceC1215Qr != null) {
            interfaceC1215Qr.setControlsAnchorView(view);
        }
    }

    public void setFunnelLoggingHandler(C1036Jp c1036Jp) {
        this.A01 = c1036Jp;
    }

    public void setIsFullScreen(boolean z10) {
        this.A04 = z10;
        this.A0D.setFullScreen(z10);
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
    }

    public void setVideoMPD(@Nullable String str) {
        this.A0D.setVideoMPD(str);
    }

    public void setVideoProgressReportIntervalMs(int i10) {
        this.A00 = i10;
    }

    public void setVideoURI(@Nullable Uri uri) {
        if (uri == null) {
            A0X();
        } else {
            A0J();
            this.A0D.setup(uri);
        }
        this.A03 = false;
    }

    public void setVideoURI(@Nullable String str) {
        this.A0A.A0D().A2x(str);
        setVideoURI(str != null ? C1070La.A00(str) : null);
    }

    public void setVolume(float f10) {
        if (f10 == 1.0f) {
            A0L(EnumC1035Jo.A0f);
            this.A0A.A0D().A31();
        } else {
            A0L(EnumC1035Jo.A0e);
            this.A0A.A0D().A30();
        }
        this.A0D.setRequestedVolume(f10);
        C07849b<AbstractC07859c, C07839a> eventBus = getEventBus();
        if (A0F[2].length() == 19) {
            throw new RuntimeException();
        }
        A0F[2] = "etD2zaPMct9y2wbR2YehsJmmTem";
        eventBus.A02(A0L);
    }
}
