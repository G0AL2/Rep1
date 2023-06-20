package com.inmobi.media;

import android.view.View;
import android.view.ViewGroup;
import com.iab.omid.library.inmobi.adsession.AdEvents;
import com.iab.omid.library.inmobi.adsession.AdSession;
import com.iab.omid.library.inmobi.adsession.AdSessionConfiguration;
import com.iab.omid.library.inmobi.adsession.AdSessionContext;
import com.iab.omid.library.inmobi.adsession.CreativeType;
import com.iab.omid.library.inmobi.adsession.ErrorType;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.inmobi.adsession.ImpressionType;
import com.iab.omid.library.inmobi.adsession.Owner;
import com.iab.omid.library.inmobi.adsession.media.InteractionType;
import com.iab.omid.library.inmobi.adsession.media.MediaEvents;
import com.iab.omid.library.inmobi.adsession.media.PlayerState;
import com.iab.omid.library.inmobi.adsession.media.VastProperties;
import java.util.Map;

/* compiled from: OmidAdSessionManagerImpl.java */
/* loaded from: classes3.dex */
public final class el implements ek {

    /* renamed from: a  reason: collision with root package name */
    private AdSessionContext f25259a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f25260b;

    /* renamed from: c  reason: collision with root package name */
    private String f25261c;

    /* renamed from: d  reason: collision with root package name */
    private ImpressionType f25262d;

    /* renamed from: e  reason: collision with root package name */
    private byte f25263e;

    /* renamed from: f  reason: collision with root package name */
    private AdSession f25264f;

    /* renamed from: g  reason: collision with root package name */
    private ej f25265g;

    public el(String str, ImpressionType impressionType, AdSessionContext adSessionContext) {
        this(str, impressionType, adSessionContext, false);
    }

    private static boolean a(byte b10, byte b11) {
        if (b10 == b11) {
            return true;
        }
        gg a10 = gg.a();
        a10.a(new hg(new Exception("Omid AdSession State Error currentState :: " + ((int) b10) + ", expectedState :: " + ((int) b11))));
        return false;
    }

    public el(String str, ImpressionType impressionType, AdSessionContext adSessionContext, boolean z10) {
        this.f25263e = (byte) 0;
        this.f25261c = str;
        this.f25262d = impressionType;
        this.f25259a = adSessionContext;
        this.f25260b = z10;
    }

    @Override // com.inmobi.media.ek
    public final void a(int i10, int i11, float f10, VastProperties vastProperties) {
        if (a(this.f25263e, (byte) 2)) {
            if (i10 == 0) {
                this.f25265g.a();
            } else if (i10 == 17) {
                ErrorType errorType = ErrorType.VIDEO;
                if (a(this.f25263e, (byte) 2)) {
                    this.f25264f.error(errorType, "Unknown Player error");
                }
            }
            ej ejVar = this.f25265g;
            MediaEvents mediaEvents = ejVar.f25258b;
            if (mediaEvents != null) {
                switch (i10) {
                    case 1:
                        mediaEvents.playerStateChange(PlayerState.FULLSCREEN);
                        return;
                    case 2:
                        mediaEvents.playerStateChange(PlayerState.NORMAL);
                        return;
                    case 3:
                    case 17:
                    default:
                        return;
                    case 4:
                        mediaEvents.adUserInteraction(InteractionType.CLICK);
                        return;
                    case 5:
                        ejVar.f25257a.loaded(vastProperties);
                        return;
                    case 6:
                        mediaEvents.start(i11, f10);
                        return;
                    case 7:
                        mediaEvents.pause();
                        return;
                    case 8:
                    case 16:
                        mediaEvents.resume();
                        return;
                    case 9:
                        mediaEvents.firstQuartile();
                        return;
                    case 10:
                        mediaEvents.midpoint();
                        return;
                    case 11:
                        mediaEvents.thirdQuartile();
                        return;
                    case 12:
                        mediaEvents.complete();
                        return;
                    case 13:
                    case 14:
                        if (13 == i10) {
                            f10 = 0.0f;
                        }
                        mediaEvents.volumeChange(f10);
                        return;
                    case 15:
                        mediaEvents.skipped();
                        return;
                    case 18:
                        mediaEvents.adUserInteraction(InteractionType.INVITATION_ACCEPTED);
                        return;
                }
            }
        }
    }

    @Override // com.inmobi.media.ek
    public final void a(int i10) {
        AdEvents adEvents;
        if (a(this.f25263e, (byte) 2)) {
            if (i10 == 0) {
                this.f25265g.a();
            } else if (i10 == 19 && (adEvents = this.f25265g.f25257a) != null) {
                adEvents.loaded();
            }
        }
    }

    private void a(View view, FriendlyObstructionPurpose friendlyObstructionPurpose) {
        if (a(this.f25263e, (byte) 1)) {
            this.f25264f.addFriendlyObstruction(view, friendlyObstructionPurpose, null);
        }
    }

    @Override // com.inmobi.media.ek
    public final void a() {
        this.f25264f.getAdSessionId();
        if (a(this.f25263e, (byte) 2)) {
            this.f25264f.finish();
            this.f25264f = null;
            this.f25263e = (byte) 3;
        }
    }

    @Override // com.inmobi.media.ek
    public final void a(AdSessionContext adSessionContext) {
        if (adSessionContext == null) {
            return;
        }
        this.f25259a = adSessionContext;
    }

    private void a(View view, Map<View, FriendlyObstructionPurpose> map, ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (!childAt.equals(view)) {
                if (map == null || !map.containsKey(childAt)) {
                    a(childAt, FriendlyObstructionPurpose.OTHER);
                }
                if (childAt instanceof ViewGroup) {
                    ViewGroup viewGroup2 = (ViewGroup) childAt;
                    if (viewGroup2.getChildCount() > 0) {
                        a(view, map, viewGroup2);
                    }
                }
            }
        }
    }

    @Override // com.inmobi.media.ek
    public final void a(View view, Map<View, FriendlyObstructionPurpose> map, View view2) {
        if (this.f25264f == null) {
            boolean z10 = this.f25260b;
            Owner owner = Owner.JAVASCRIPT;
            Owner owner2 = null;
            CreativeType creativeType = CreativeType.DEFINED_BY_JAVASCRIPT;
            String str = this.f25261c;
            str.hashCode();
            char c10 = 65535;
            switch (str.hashCode()) {
                case -2139264536:
                    if (str.equals("native_display_ad")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -1329992236:
                    if (str.equals("html_display_ad")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case -1191784049:
                    if (str.equals("native_video_ad")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 538665083:
                    if (str.equals("html_video_ad")) {
                        c10 = 3;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    owner = Owner.NATIVE;
                    owner2 = Owner.NONE;
                    creativeType = CreativeType.NATIVE_DISPLAY;
                    break;
                case 1:
                    owner2 = Owner.NONE;
                    creativeType = CreativeType.HTML_DISPLAY;
                    break;
                case 2:
                    owner = Owner.NATIVE;
                    creativeType = CreativeType.VIDEO;
                    owner2 = owner;
                    break;
                case 3:
                    creativeType = CreativeType.VIDEO;
                    owner2 = owner;
                    break;
            }
            AdSession createAdSession = AdSession.createAdSession(AdSessionConfiguration.createAdSessionConfiguration(creativeType, this.f25262d, owner, owner2, z10), this.f25259a);
            this.f25264f = createAdSession;
            this.f25265g = new ej(createAdSession, this.f25261c);
            this.f25263e = (byte) 1;
        }
        if (a(this.f25263e, (byte) 1)) {
            this.f25264f.registerAdView(view);
        }
        if (map != null) {
            for (Map.Entry<View, FriendlyObstructionPurpose> entry : map.entrySet()) {
                a(entry.getKey(), entry.getValue());
            }
        }
        if (view2 != null && view != null && (view2 instanceof ViewGroup)) {
            a(view, map, (ViewGroup) view2);
        }
        if (a(this.f25263e, (byte) 1)) {
            this.f25264f.start();
            this.f25263e = (byte) 2;
        }
        this.f25264f.getAdSessionId();
    }
}
