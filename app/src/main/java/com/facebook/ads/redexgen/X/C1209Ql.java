package com.facebook.ads.redexgen.X;

import android.widget.MediaController;

/* renamed from: com.facebook.ads.redexgen.X.Ql  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1209Ql implements MediaController.MediaPlayerControl {
    public static String[] A01 = {"T46fCpiGc88W2sm67KitVw29EyPc3", "CnzVRlVQiaWVzZBS", "ndpW2a6BPo0GfPTTlqn3VUL3zbZB353", "6dBvfVqLyh6nhF4N5m", "imXeYKfRY50epxOYIoCDJpdee5DGPOn9", "a2YCts1Ck8i", "mjIxnllGj7l0AybsaVU42LegCoMqgA9", "OPSSIwvLFtyh4B3JmayX8W92hCUnvGiN"};
    public final /* synthetic */ I7 A00;

    public C1209Ql(I7 i72) {
        this.A00 = i72;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final boolean canPause() {
        return true;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final boolean canSeekBackward() {
        return true;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final boolean canSeekForward() {
        return true;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final int getAudioSessionId() {
        C1204Qg c1204Qg;
        C1204Qg c1204Qg2;
        c1204Qg = this.A00.A0C;
        if (c1204Qg != null) {
            c1204Qg2 = this.A00.A0C;
            return c1204Qg2.A04();
        }
        return 0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final int getBufferPercentage() {
        C1204Qg c1204Qg;
        C1204Qg c1204Qg2;
        c1204Qg = this.A00.A0C;
        if (c1204Qg != null) {
            c1204Qg2 = this.A00.A0C;
            return c1204Qg2.A05();
        }
        return 0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final int getCurrentPosition() {
        return this.A00.getCurrentPosition();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final int getDuration() {
        return this.A00.getDuration();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final boolean isPlaying() {
        C1204Qg c1204Qg;
        C1204Qg c1204Qg2;
        c1204Qg = this.A00.A0C;
        if (c1204Qg != null) {
            c1204Qg2 = this.A00.A0C;
            if (c1204Qg2.A0J()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final void pause() {
        InterfaceC1218Qu interfaceC1218Qu;
        InterfaceC1218Qu interfaceC1218Qu2;
        interfaceC1218Qu = this.A00.A0F;
        if (interfaceC1218Qu != null) {
            interfaceC1218Qu2 = this.A00.A0F;
            String[] strArr = A01;
            if (strArr[1].length() == strArr[5].length()) {
                throw new RuntimeException();
            }
            A01[3] = "BHfWGVDMvGTMo8ZI3A6S5KtrLH6Ee";
            interfaceC1218Qu2.ABR();
        }
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final void seekTo(int i10) {
        this.A00.seekTo(i10);
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final void start() {
        InterfaceC1218Qu interfaceC1218Qu;
        InterfaceC1218Qu interfaceC1218Qu2;
        interfaceC1218Qu = this.A00.A0F;
        if (interfaceC1218Qu != null) {
            interfaceC1218Qu2 = this.A00.A0F;
            interfaceC1218Qu2.ABS();
        }
    }
}
