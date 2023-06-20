package com.facebook.ads.redexgen.X;

import android.media.MediaPlayer;
import android.widget.MediaController;

/* renamed from: com.facebook.ads.redexgen.X.Qo  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1212Qo implements MediaController.MediaPlayerControl {
    public static String[] A01 = {"hSLXxwS3ED2PXa4HWxT5O8AkoZWeLCaL", "Gmogcdio2x0gXeHeLgUduGgoR45wUaaW", "srtP07DjK9aYu1B8NyoR8EE0J7RhN7X5", "MH7", "NBYiw3cvWUp2yNoHdye4I6uBFIshebL3", "osH0FOpWNHuyeeWL1EivPIw0cJCzEheb", "y4KJdcSo65PTSQflVKQ3KiIVJaTfePYu", "FLJEaU0xa"};
    public final /* synthetic */ I5 A00;

    public C1212Qo(I5 i52) {
        this.A00 = i52;
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
        MediaPlayer mediaPlayer;
        MediaPlayer mediaPlayer2;
        mediaPlayer = this.A00.A06;
        if (mediaPlayer != null) {
            mediaPlayer2 = this.A00.A06;
            return mediaPlayer2.getAudioSessionId();
        }
        return 0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final int getBufferPercentage() {
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
        MediaPlayer mediaPlayer;
        MediaPlayer mediaPlayer2;
        mediaPlayer = this.A00.A06;
        if (mediaPlayer != null) {
            I5 i52 = this.A00;
            if (A01[3].length() == 27) {
                throw new RuntimeException();
            }
            A01[1] = "lkPRs4KbLtabABAzVL2ijXaoS745wM0q";
            mediaPlayer2 = i52.A06;
            if (mediaPlayer2.isPlaying()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final void pause() {
        InterfaceC1218Qu interfaceC1218Qu;
        InterfaceC1218Qu interfaceC1218Qu2;
        interfaceC1218Qu = this.A00.A0E;
        if (interfaceC1218Qu != null) {
            interfaceC1218Qu2 = this.A00.A0E;
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
        interfaceC1218Qu = this.A00.A0E;
        if (interfaceC1218Qu != null) {
            interfaceC1218Qu2 = this.A00.A0E;
            interfaceC1218Qu2.ABS();
        }
    }
}
