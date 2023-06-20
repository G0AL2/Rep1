package com.fyber.inneractive.sdk.activities;

import android.media.MediaPlayer;
import com.fyber.inneractive.sdk.util.IAlog;

/* loaded from: classes.dex */
public class i implements MediaPlayer.OnErrorListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ InneractiveRichMediaVideoPlayerActivityCore f16701a;

    public i(InneractiveRichMediaVideoPlayerActivityCore inneractiveRichMediaVideoPlayerActivityCore) {
        this.f16701a = inneractiveRichMediaVideoPlayerActivityCore;
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public boolean onError(MediaPlayer mediaPlayer, int i10, int i11) {
        IAlog.a("Error: video can not be played.", new Object[0]);
        this.f16701a.finish();
        return false;
    }
}
