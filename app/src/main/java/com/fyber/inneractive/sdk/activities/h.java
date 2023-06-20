package com.fyber.inneractive.sdk.activities;

import android.media.MediaPlayer;

/* loaded from: classes.dex */
public class h implements MediaPlayer.OnCompletionListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ InneractiveRichMediaVideoPlayerActivityCore f16700a;

    public h(InneractiveRichMediaVideoPlayerActivityCore inneractiveRichMediaVideoPlayerActivityCore) {
        this.f16700a = inneractiveRichMediaVideoPlayerActivityCore;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public void onCompletion(MediaPlayer mediaPlayer) {
        this.f16700a.finish();
    }
}
