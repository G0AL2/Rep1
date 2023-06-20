package com.fyber.inneractive.sdk.mraid;

import com.fyber.inneractive.sdk.ui.IAmraidWebViewController;
import com.fyber.inneractive.sdk.util.p0;
import com.fyber.inneractive.sdk.web.d;
import java.util.Map;

/* loaded from: classes.dex */
public class m extends a {
    public m(Map<String, String> map, com.fyber.inneractive.sdk.web.d dVar, p0 p0Var) {
        super(map, dVar, p0Var);
    }

    @Override // com.fyber.inneractive.sdk.mraid.b
    public void a() {
        String str = this.f17489b.get("uri");
        if (str != null && !"".equals(str)) {
            L l10 = ((IAmraidWebViewController) this.f17490c).f20370g;
            if (l10 != 0) {
                ((d.f) l10).a(str);
                return;
            }
            return;
        }
        this.f17490c.a(f.PLAY_VIDEO, "Video can't be played with null or empty URL");
    }

    @Override // com.fyber.inneractive.sdk.mraid.a
    public String c() {
        return this.f17489b.get("uri");
    }
}
