package com.facebook.ads.redexgen.X;

import android.annotation.TargetApi;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.widget.MediaController;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.settings.AdInternalSettings;
import com.vehiclecloud.app.videofetch.rndownloader.data.vo.DownloadResource;
import java.util.Arrays;

@TargetApi(14)
/* loaded from: assets/audience_network.dex */
public final class I7 extends TextureView implements TextureView.SurfaceTextureListener, InterfaceC1201Qd, InterfaceC1215Qr, InterfaceC1203Qf {
    public static byte[] A0N;
    public static String[] A0O = {"5i34yksohRV8hSvEB2dTOBGqhO", "V2RNkeamXobpzSRVkM4sjlG", "1HR", "8SLqGCa2wxiVkGjIaPVK9LXerY", "SSmTkZgpl4jZsKBndOsNgmbhAq5FKejN", "hgMiihLf1lx1lIiVFZ8jC", "euSTtDnbG06q2RqThlQcyR1Es6oMHQDw", "iHXqYQoKvaPWKvo"};
    public static final String A0P;
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public long A05;
    public Uri A06;
    @Nullable
    public Surface A07;
    public View A08;
    @Nullable
    public MediaController A09;
    public C1400Xy A0A;
    public Q6 A0B;
    @Nullable
    public C1204Qg A0C;
    public EnumC1217Qt A0D;
    public EnumC1217Qt A0E;
    @Nullable
    public InterfaceC1218Qu A0F;
    @Nullable
    public String A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;

    public static String A03(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0N, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 68);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A0N = new byte[]{86, 126, 126, 118, 125, 116, 49, 112, 125, 102, 112, 104, 98, 49, 101, 121, 99, 126, 102, 49, 112, Byte.MAX_VALUE, 49, 116, 105, 114, 116, 97, 101, 120, 126, Byte.MAX_VALUE, 49, 102, 120, 101, 121, 49, 98, 116, 101, 83, 112, 114, 122, 118, 99, 126, 100, Byte.MAX_VALUE, 117, 85, 99, 112, 102, 112, 115, 125, 116, 49, 126, Byte.MAX_VALUE, 49, 95, 126, 100, 118, 112, 101, 49, 112, 115, 126, 103, 116, 63, 49, 98, 126, 49, 102, 116, 49, 98, 120, 125, 116, Byte.MAX_VALUE, 101, 125, 104, 49, 120, 118, Byte.MAX_VALUE, 126, 99, 116, 49, 120, 101, 63, 76, 100, 100, 108, 103, 110, 43, 106, 103, 124, 106, 114, 120, 43, Byte.MAX_VALUE, 99, 121, 100, 124, 43, 106, 101, 43, 110, 115, 104, 110, 123, Byte.MAX_VALUE, 98, 100, 101, 43, 124, 98, Byte.MAX_VALUE, 99, 43, 120, 110, Byte.MAX_VALUE, 77, 100, 121, 110, 108, 121, 100, 126, 101, 111, 43, 100, 101, 43, 69, 100, 126, 108, 106, Byte.MAX_VALUE, 43, 106, 105, 100, 125, 110, 37, 43, 120, 100, 43, 124, 110, 43, 120, 98, 103, 110, 101, Byte.MAX_VALUE, 103, 114, 43, 98, 108, 101, 100, 121, 110, 43, 98, Byte.MAX_VALUE, 37, 33, 30, 19, 18, 24, 87, 4, 3, 22, 3, 18, 87, 20, 31, 22, 25, 16, 18, 19, 87, 3, 24, 87, 95, 93, 86, 93, 74, 81, 91};
        String[] strArr = A0O;
        if (strArr[4].charAt(4) == strArr[6].charAt(4)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0O;
        strArr2[3] = "4Rjqxy3w03hT2rk3wOaPN94qCv";
        strArr2[0] = "J56YrdEaTg6GnpCj3tljjm9xxp";
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 12 out of bounds for length 12
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        if (JR.A1J(this.A0A) && this.A0D != EnumC1217Qt.A08) {
            long currentPosition = getCurrentPosition();
            long currentPosition2 = getCurrentPosition();
            long currentTimeMillis = System.currentTimeMillis();
            float volume = getVolume();
            InterfaceC1218Qu interfaceC1218Qu = this.A0F;
            if (interfaceC1218Qu != null) {
                interfaceC1218Qu.AAq(currentPosition, currentPosition2, currentTimeMillis, volume);
            }
        }
    }

    static {
        A07();
        A0P = I7.class.getSimpleName();
    }

    public I7(C1400Xy c1400Xy) {
        super(c1400Xy);
        this.A0D = EnumC1217Qt.A04;
        this.A0E = EnumC1217Qt.A04;
        this.A0L = false;
        this.A0M = false;
        this.A0J = false;
        this.A03 = 0;
        this.A02 = 0;
        this.A00 = 1.0f;
        this.A01 = -1;
        this.A0I = false;
        this.A0H = false;
        this.A0B = Q6.A03;
        this.A0K = false;
        this.A0A = c1400Xy;
    }

    public I7(C1400Xy c1400Xy, AttributeSet attributeSet) {
        super(c1400Xy, attributeSet);
        this.A0D = EnumC1217Qt.A04;
        this.A0E = EnumC1217Qt.A04;
        this.A0L = false;
        this.A0M = false;
        this.A0J = false;
        this.A03 = 0;
        this.A02 = 0;
        this.A00 = 1.0f;
        this.A01 = -1;
        this.A0I = false;
        this.A0H = false;
        this.A0B = Q6.A03;
        this.A0K = false;
        this.A0A = c1400Xy;
    }

    public I7(C1400Xy c1400Xy, AttributeSet attributeSet, int i10) {
        super(c1400Xy, attributeSet, i10);
        this.A0D = EnumC1217Qt.A04;
        this.A0E = EnumC1217Qt.A04;
        this.A0L = false;
        this.A0M = false;
        this.A0J = false;
        this.A03 = 0;
        this.A02 = 0;
        this.A00 = 1.0f;
        this.A01 = -1;
        this.A0I = false;
        this.A0H = false;
        this.A0B = Q6.A03;
        this.A0K = false;
        this.A0A = c1400Xy;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0085, code lost:
        if (r4 != null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x008b, code lost:
        if (r4.length() == 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x008f, code lost:
        if (r5.A0K == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0091, code lost:
        r5.A0C.A0F(r5.A0A.A00(), r5.A06);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00bd, code lost:
        if (r4 != null) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A04() {
        /*
            r5 = this;
            com.facebook.ads.redexgen.X.Xy r1 = r5.A0A
            com.facebook.ads.redexgen.X.Qg r0 = new com.facebook.ads.redexgen.X.Qg
            r0.<init>(r1)
            r5.A0C = r0
            com.facebook.ads.redexgen.X.Qg r0 = r5.A0C
            r0.A0H(r5)
            com.facebook.ads.redexgen.X.Qg r0 = r5.A0C
            r0.A0G(r5)
            com.facebook.ads.redexgen.X.Qg r0 = r5.A0C
            r3 = 0
            r0.A0I(r3)
            boolean r0 = r5.A0J
            if (r0 == 0) goto L69
            boolean r0 = r5.A0I
            if (r0 != 0) goto L69
            com.facebook.ads.redexgen.X.Xy r0 = r5.A0A
            android.app.Activity r4 = r0.A0C()
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.I7.A0O
            r0 = 5
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 21
            if (r1 == r0) goto L3a
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L3a:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.I7.A0O
            java.lang.String r1 = "kOzpobq3cn2ENPvO1dz11rE9gYrdsM2t"
            r0 = 4
            r2[r0] = r1
            java.lang.String r1 = "XeC6T5eSgweGxN3AGx0qK1AhpVQau6BW"
            r0 = 6
            r2[r0] = r1
            if (r4 == 0) goto Lc0
            android.widget.MediaController r0 = new android.widget.MediaController
            r0.<init>(r4)
            r5.A09 = r0
            android.widget.MediaController r1 = r5.A09
            android.view.View r0 = r5.A08
            if (r0 != 0) goto L56
            r0 = r5
        L56:
            r1.setAnchorView(r0)
            android.widget.MediaController r1 = r5.A09
            com.facebook.ads.redexgen.X.Ql r0 = new com.facebook.ads.redexgen.X.Ql
            r0.<init>(r5)
            r1.setMediaPlayer(r0)
            android.widget.MediaController r1 = r5.A09
            r0 = 1
            r1.setEnabled(r0)
        L69:
            java.lang.String r4 = r5.A0G
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.I7.A0O
            r0 = 4
            r1 = r2[r0]
            r0 = 6
            r2 = r2[r0]
            r0 = 4
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto Lb1
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.I7.A0O
            java.lang.String r1 = "7OzxCvlMe7OewOex"
            r0 = 1
            r2[r0] = r1
            if (r4 == 0) goto L91
        L87:
            int r0 = r4.length()
            if (r0 == 0) goto L91
            boolean r0 = r5.A0K
            if (r0 == 0) goto L9e
        L91:
            com.facebook.ads.redexgen.X.Qg r2 = r5.A0C
            com.facebook.ads.redexgen.X.Xy r0 = r5.A0A
            com.facebook.ads.redexgen.X.Xx r1 = r0.A00()
            android.net.Uri r0 = r5.A06
            r2.A0F(r1, r0)
        L9e:
            com.facebook.ads.redexgen.X.Qt r0 = com.facebook.ads.redexgen.X.EnumC1217Qt.A08
            r5.setVideoState(r0)
            boolean r0 = r5.isAvailable()
            if (r0 == 0) goto Lb0
            android.graphics.SurfaceTexture r0 = r5.getSurfaceTexture()
            r5.onSurfaceTextureAvailable(r0, r3, r3)
        Lb0:
            return
        Lb1:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.I7.A0O
            java.lang.String r1 = "NXAVCVHzJxAz58YH1UEgH4PHy83Kp8aQ"
            r0 = 4
            r2[r0] = r1
            java.lang.String r1 = "f1ODdwAOeVqSGvJpvEMDUKedn4FgojKu"
            r0 = 6
            r2[r0] = r1
            if (r4 == 0) goto L91
            goto L87
        Lc0:
            r0 = 0
            r5.A09 = r0
            goto L69
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.I7.A04():void");
    }

    private void A05() {
        C1204Qg c1204Qg = this.A0C;
        if (c1204Qg == null) {
            return;
        }
        C1202Qe A08 = c1204Qg.A08();
        String[] strArr = A0O;
        if (strArr[3].length() != strArr[0].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0O;
        strArr2[3] = "yniwio37QFCiL85s5GWvJngxgc";
        strArr2[0] = "95HbvmBBNGyB2bovEph22CE4vZ";
        if (A08 != null) {
            A08(A08.A01, A08.A00);
        }
    }

    private void A06() {
        Surface surface = this.A07;
        if (surface != null) {
            surface.release();
            this.A07 = null;
        }
        C1204Qg c1204Qg = this.A0C;
        if (c1204Qg != null) {
            c1204Qg.A09();
            if (A0O[5].length() != 21) {
                throw new RuntimeException();
            }
            String[] strArr = A0O;
            strArr[3] = "he0jjWxzFB8qDestWT3k7cDZmQ";
            strArr[0] = "YQusGxI3ZRGEiRLtvLIlZ3cCdg";
            this.A0C = null;
        }
        this.A09 = null;
        this.A0M = false;
        setVideoState(EnumC1217Qt.A04);
    }

    private void A08(int i10, int i11) {
        if (i10 != this.A03 || i11 != this.A02) {
            this.A03 = i10;
            this.A02 = i11;
            if (this.A03 != 0 && this.A02 != 0) {
                requestLayout();
            }
        }
    }

    public static boolean A09() {
        return C1204Qg.A03();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1215Qr
    public final void A7u() {
        if (!this.A0H) {
            AD5(false, 3);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1215Qr
    public final boolean A85() {
        C1204Qg c1204Qg = this.A0C;
        return c1204Qg != null && c1204Qg.A0K();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1215Qr
    public final boolean A86() {
        return this.A0M;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1215Qr
    public final boolean A8b() {
        return this.A0L;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1201Qd
    public final void ABr(String str, Exception exc) {
        this.A0A.A0D().A9c(str);
        this.A0A.A0D().A2v(1);
        setVideoState(EnumC1217Qt.A03);
        this.A0A.A06().A8y(A03(219, 7, 124), C07828z.A1N, new AnonymousClass90(exc));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1201Qd
    public final void ABs(boolean z10, int i10) {
        if (this.A0C == null) {
            return;
        }
        if (i10 == 1) {
            setVideoState(EnumC1217Qt.A04);
        } else if (i10 != 2) {
            if (i10 == 3) {
                A05();
                this.A04 = System.currentTimeMillis();
                setRequestedVolume(this.A00);
                long j10 = this.A05;
                if (j10 > 0 && j10 < this.A0C.A07()) {
                    this.A0C.A0D(this.A05);
                    this.A05 = 0L;
                }
                if (this.A0C.A06() != 0 && !z10 && this.A0M) {
                    setVideoState(EnumC1217Qt.A05);
                    return;
                } else if (z10 || this.A0D == EnumC1217Qt.A06) {
                    return;
                } else {
                    setVideoState(EnumC1217Qt.A07);
                    EnumC1217Qt enumC1217Qt = this.A0E;
                    String[] strArr = A0O;
                    if (strArr[4].charAt(4) != strArr[6].charAt(4)) {
                        String[] strArr2 = A0O;
                        strArr2[3] = "QOwsd8cFgtBxhwq2W5mYjt9JcX";
                        strArr2[0] = "NiYGjjh9hUScPgNoOA1xOqSddN";
                        if (enumC1217Qt != EnumC1217Qt.A0A) {
                            return;
                        }
                    } else if (enumC1217Qt != EnumC1217Qt.A0A) {
                        return;
                    }
                    AEw(this.A0B, 8);
                    EnumC1217Qt enumC1217Qt2 = EnumC1217Qt.A04;
                    String[] strArr3 = A0O;
                    if (strArr3[3].length() == strArr3[0].length()) {
                        A0O[5] = "yetXNvPdXumqVjXfCpilY";
                        this.A0E = enumC1217Qt2;
                        return;
                    }
                }
            } else if (i10 != 4) {
                return;
            } else {
                if (z10) {
                    setVideoState(EnumC1217Qt.A06);
                }
                C1204Qg c1204Qg = this.A0C;
                if (A0O[5].length() == 21) {
                    A0O[5] = "KLjUXng8f5n9djrrPXv2F";
                    if (c1204Qg != null) {
                        c1204Qg.A0I(false);
                        if (!z10) {
                            this.A0C.A0A();
                        }
                    }
                    this.A0M = false;
                    return;
                }
            }
            throw new RuntimeException();
        } else {
            A05();
            int i11 = this.A01;
            if (A0O[1].length() == 30) {
                throw new RuntimeException();
            }
            String[] strArr4 = A0O;
            strArr4[2] = "9yr";
            strArr4[7] = "mKFyaVoRgsxwFz3";
            if (i11 < 0) {
                return;
            }
            int i12 = this.A01;
            this.A01 = -1;
            InterfaceC1218Qu interfaceC1218Qu = this.A0F;
            if (interfaceC1218Qu == null) {
                return;
            }
            int currentPosition = getCurrentPosition();
            String[] strArr5 = A0O;
            if (strArr5[3].length() != strArr5[0].length()) {
                interfaceC1218Qu.ACG(i12, currentPosition);
                return;
            }
            A0O[5] = "bt2gfLOq6VYcjgDmYUS3R";
            interfaceC1218Qu.ACG(i12, currentPosition);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1203Qf
    public final void ACq(int i10, int i11, int i12, float f10) {
        A08(i10, i11);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1215Qr
    public final void AD5(boolean z10, int i10) {
        this.A0A.A0D().A2r(i10);
        this.A0E = EnumC1217Qt.A05;
        this.A0L = z10;
        C1204Qg c1204Qg = this.A0C;
        if (c1204Qg != null) {
            c1204Qg.A0I(false);
        } else {
            setVideoState(EnumC1217Qt.A04);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1215Qr
    public final void AEr(int i10) {
        this.A0A.A0D().A9d(i10);
        setVideoState(EnumC1217Qt.A09);
        AF3(5);
        this.A05 = 0L;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1215Qr
    public final void AEw(Q6 q62, int i10) {
        this.A0A.A0D().A32(i10);
        this.A0L = false;
        this.A0E = EnumC1217Qt.A0A;
        this.A0B = q62;
        if (this.A0C == null) {
            setup(this.A06);
        } else if (this.A0D != EnumC1217Qt.A07 && this.A0D != EnumC1217Qt.A05 && this.A0D != EnumC1217Qt.A06) {
        } else {
            this.A0C.A0I(true);
            setVideoState(EnumC1217Qt.A0A);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1215Qr
    public final void AF3(int i10) {
        this.A0A.A0D().A34(i10);
        this.A0E = EnumC1217Qt.A04;
        C1204Qg c1204Qg = this.A0C;
        if (c1204Qg != null) {
            c1204Qg.A0B();
            this.A0C.A09();
            this.A0C = null;
        }
        setVideoState(EnumC1217Qt.A04);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1215Qr
    public final void destroy() {
        A06();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1215Qr
    public int getCurrentPosition() {
        C1204Qg c1204Qg = this.A0C;
        if (c1204Qg != null) {
            return (int) c1204Qg.A06();
        }
        return 0;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1215Qr
    public int getDuration() {
        C1204Qg c1204Qg = this.A0C;
        if (c1204Qg == null) {
            return 0;
        }
        return (int) c1204Qg.A07();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1215Qr
    public long getInitialBufferTime() {
        return this.A04;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1215Qr
    public Q6 getStartReason() {
        return this.A0B;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1215Qr
    public EnumC1217Qt getState() {
        return this.A0D;
    }

    public EnumC1217Qt getTargetState() {
        return this.A0E;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1215Qr
    public int getVideoHeight() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1215Qr
    public int getVideoWidth() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1215Qr
    public View getView() {
        return this;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1215Qr
    public float getVolume() {
        return this.A00;
    }

    @Override // android.view.TextureView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (JR.A1t(getContext()) && !isHardwareAccelerated()) {
            setVideoState(EnumC1217Qt.A03);
            AF3(8);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        Surface surface = this.A07;
        if (surface != null) {
            surface.release();
        }
        this.A07 = new Surface(surfaceTexture);
        C1204Qg c1204Qg = this.A0C;
        if (c1204Qg == null) {
            return;
        }
        c1204Qg.A0E(this.A07);
        if (this.A0D == EnumC1217Qt.A05 && !this.A0L) {
            AEw(this.A0B, 7);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        Surface surface = this.A07;
        if (surface != null) {
            surface.release();
            this.A07 = null;
            C1204Qg c1204Qg = this.A0C;
            if (c1204Qg != null) {
                c1204Qg.A0E(null);
            }
        }
        if (this.A0D != EnumC1217Qt.A05) {
            if (A0O[5].length() != 21) {
                throw new RuntimeException();
            }
            A0O[5] = "TScQzo9LVHiM3saFvXTgi";
            AD5(false, 5);
            return true;
        }
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        if (this.A0C == null) {
            return;
        }
        MediaController mediaController = this.A09;
        if (mediaController != null && mediaController.isShowing()) {
            return;
        }
        if (!z10) {
            if (this.A0D != EnumC1217Qt.A05) {
                A7u();
            }
        } else if (this.A0D != EnumC1217Qt.A05 || this.A0L) {
        } else {
            AEw(this.A0B, 9);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1215Qr
    public final void seekTo(int i10) {
        if (this.A0C != null) {
            this.A01 = getCurrentPosition();
            this.A0C.A0D(i10);
            return;
        }
        long j10 = i10;
        String[] strArr = A0O;
        if (strArr[2].length() == strArr[7].length()) {
            throw new RuntimeException();
        }
        A0O[5] = "kfjJwAtkK1UY2s6fcoM3d";
        this.A05 = j10;
    }

    @Override // android.view.TextureView, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (Build.VERSION.SDK_INT < 24) {
            super.setBackgroundDrawable(drawable);
            return;
        }
        boolean isDebugBuild = AdInternalSettings.isDebugBuild();
        if (A0O[5].length() != 21) {
            throw new RuntimeException();
        }
        A0O[1] = "HF5JdwiOlRNKOfaOH";
        if (!isDebugBuild) {
            return;
        }
        Log.w(A0P, A03(0, 102, 85));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1215Qr
    public void setBackgroundPlaybackEnabled(boolean z10) {
        this.A0H = z10;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1215Qr
    public void setControlsAnchorView(View view) {
        this.A08 = view;
        view.setOnTouchListener(new View$OnTouchListenerC1211Qn(this));
    }

    @Override // android.view.TextureView, android.view.View
    public void setForeground(Drawable drawable) {
        if (Build.VERSION.SDK_INT < 24) {
            super.setForeground(drawable);
        } else if (!AdInternalSettings.isDebugBuild()) {
        } else {
            String str = A0P;
            String[] strArr = A0O;
            if (strArr[3].length() != strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0O;
            strArr2[4] = "adR4uJi1AjYNmamYU7fKdN8LPQzpuqJY";
            strArr2[6] = "LCKmfGi2Ka9VnYBnqFwdGZK0MZJmec2m";
            Log.w(str, A03(102, 94, 79));
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1215Qr
    public void setFullScreen(boolean z10) {
        this.A0J = z10;
        if (z10 && !this.A0I) {
            setOnTouchListener(new View$OnTouchListenerC1210Qm(this));
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1215Qr
    public void setRequestedVolume(float f10) {
        this.A00 = f10;
        if (this.A0C != null && this.A0D != EnumC1217Qt.A08 && this.A0D != EnumC1217Qt.A04) {
            this.A0C.A0C(f10);
        }
    }

    public void setTestMode(boolean z10) {
        this.A0K = z10;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1215Qr
    public void setVideoMPD(@Nullable String str) {
        this.A0G = str;
    }

    private void setVideoState(EnumC1217Qt enumC1217Qt) {
        if (enumC1217Qt != this.A0D) {
            if (this.A0A.A03().A8P()) {
                String str = A03(DownloadResource.STATUS_QUEUED_FOR_WIFI, 23, 51) + enumC1217Qt;
            }
            this.A0D = enumC1217Qt;
            if (this.A0D == EnumC1217Qt.A0A) {
                this.A0M = true;
            }
            InterfaceC1218Qu interfaceC1218Qu = this.A0F;
            if (interfaceC1218Qu != null) {
                interfaceC1218Qu.ACs(enumC1217Qt);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1215Qr
    public void setVideoStateChangeListener(@Nullable InterfaceC1218Qu interfaceC1218Qu) {
        this.A0F = interfaceC1218Qu;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1215Qr
    public void setup(Uri uri) {
        this.A0A.A0D().A2u();
        if (this.A0C != null) {
            A06();
        }
        this.A06 = uri;
        setSurfaceTextureListener(this);
        A04();
    }
}
