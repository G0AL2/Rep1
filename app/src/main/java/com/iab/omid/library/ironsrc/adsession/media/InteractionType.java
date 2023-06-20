package com.iab.omid.library.ironsrc.adsession.media;

import com.inmobi.media.au;

/* loaded from: classes3.dex */
public enum InteractionType {
    CLICK(au.CLICK_BEACON),
    INVITATION_ACCEPTED("invitationAccept");
    
    String interactionType;

    InteractionType(String str) {
        this.interactionType = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.interactionType;
    }
}
