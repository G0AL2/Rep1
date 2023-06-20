package com.facebook.ads.redexgen.X;

import android.net.Uri;
import android.view.View;
import androidx.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.Qr  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public interface InterfaceC1215Qr {
    void A7u();

    boolean A85();

    boolean A86();

    boolean A8b();

    void AD5(boolean z10, int i10);

    void AEr(int i10);

    void AEw(Q6 q62, int i10);

    void AF3(int i10);

    void destroy();

    int getCurrentPosition();

    int getDuration();

    long getInitialBufferTime();

    Q6 getStartReason();

    EnumC1217Qt getState();

    int getVideoHeight();

    int getVideoWidth();

    View getView();

    float getVolume();

    void seekTo(int i10);

    void setBackgroundPlaybackEnabled(boolean z10);

    void setControlsAnchorView(View view);

    void setFullScreen(boolean z10);

    void setRequestedVolume(float f10);

    void setVideoMPD(@Nullable String str);

    void setVideoStateChangeListener(@Nullable InterfaceC1218Qu interfaceC1218Qu);

    void setup(Uri uri);
}
