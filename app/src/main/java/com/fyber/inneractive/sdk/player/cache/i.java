package com.fyber.inneractive.sdk.player.cache;

import android.media.MediaExtractor;
import com.fyber.inneractive.sdk.player.cache.b;

/* loaded from: classes.dex */
public class i extends b {
    @Override // com.fyber.inneractive.sdk.player.cache.b
    public b.a a(a aVar, String str) {
        b.a aVar2 = b.a.INVALID;
        MediaExtractor mediaExtractor = new MediaExtractor();
        try {
            mediaExtractor.setDataSource(aVar.a().getAbsolutePath());
            for (int i10 = 0; i10 < mediaExtractor.getTrackCount(); i10++) {
                String string = mediaExtractor.getTrackFormat(i10).getString("mime");
                if (string != null && string.startsWith("video/")) {
                    aVar2 = b.a.OK;
                    break;
                }
            }
        } catch (Throwable unused) {
        }
        try {
            mediaExtractor.release();
        } catch (Throwable unused2) {
        }
        return aVar2;
    }
}
