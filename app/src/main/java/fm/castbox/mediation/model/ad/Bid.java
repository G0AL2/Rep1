package fm.castbox.mediation.model.ad;

import android.util.Log;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.f;
import com.google.gson.g;
import com.google.gson.h;
import com.google.gson.k;
import com.google.gson.l;
import com.google.gson.n;
import com.google.gson.o;
import fm.castbox.mediation.http.HttpClient;
import fm.castbox.mediation.model.DisplayResult;
import fm.castbox.mediation.model.NetworkName;
import fm.castbox.mediation.model.ad.bidding.facebook.AudienceNetworkBid;
import java.lang.reflect.Type;

/* loaded from: classes3.dex */
public class Bid extends BaseCompound {
    private static final String TAG = "Bid";
    private Object variantObj;

    public static g<Bid> createJsonDeserializer() {
        return new g<Bid>() { // from class: fm.castbox.mediation.model.ad.Bid.2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.gson.g
            public Bid deserialize(h hVar, Type type, f fVar) throws l {
                Gson create = new GsonBuilder().create();
                k f10 = hVar.f();
                Bid bid = new Bid();
                String h10 = f10.o("network_name").h();
                h10.hashCode();
                if (h10.equals(NetworkName.FACEBOOK_AUDIENCE_NETWORK)) {
                    bid.variantObj = create.fromJson(hVar, (Class<Object>) AudienceNetworkBid.class);
                    return bid;
                }
                throw new l(String.format("failed to unmarshal bid data for network name %s", h10));
            }
        };
    }

    public static o<Bid> createJsonSerializer() {
        return new o<Bid>() { // from class: fm.castbox.mediation.model.ad.Bid.1
            @Override // com.google.gson.o
            public h serialize(Bid bid, Type type, n nVar) {
                if (bid.variantObj instanceof AudienceNetworkBid) {
                    return nVar.b((AudienceNetworkBid) bid.variantObj);
                }
                return nVar.b(null);
            }
        };
    }

    public AudienceNetworkBid convertAudienceNetworkBid() {
        Object obj = this.variantObj;
        if (obj instanceof AudienceNetworkBid) {
            return (AudienceNetworkBid) obj;
        }
        return null;
    }

    @Override // fm.castbox.mediation.model.ad.BaseCompound
    public DisplayResult getDisplayResult(boolean z10) {
        return new DisplayResult(DisplayResult.CATEGORY_BIDDING, z10, networkName(), getTagId());
    }

    @Override // fm.castbox.mediation.model.ad.BaseCompound
    public float getEcpm() {
        Object obj = this.variantObj;
        if (obj instanceof AudienceNetworkBid) {
            return ((AudienceNetworkBid) obj).getEcpm();
        }
        return 0.0f;
    }

    @Override // fm.castbox.mediation.model.ad.BaseCompound
    public String getTagId() {
        Object obj = this.variantObj;
        if (obj instanceof AudienceNetworkBid) {
            return ((AudienceNetworkBid) obj).getPlacementId();
        }
        return null;
    }

    public void kickoffAdDisplayNotification() {
        if (this.variantObj == null) {
            Log.w(TAG, "variant object is null inside bid");
            return;
        }
        String networkName = networkName();
        networkName.hashCode();
        if (!networkName.equals(NetworkName.FACEBOOK_AUDIENCE_NETWORK)) {
            Log.e(TAG, String.format("%s does not support display notification", networkName()));
            return;
        }
        AudienceNetworkBid convertAudienceNetworkBid = convertAudienceNetworkBid();
        if (convertAudienceNetworkBid == null) {
            Log.e(TAG, "failed to convert variant object to audience network bidder object");
        } else {
            HttpClient.getInstance().fulfillDisplayNotification(convertAudienceNetworkBid.getDisplayNotificationUrl());
        }
    }

    @Override // fm.castbox.mediation.model.ad.BaseCompound
    public String networkName() {
        Object obj = this.variantObj;
        return obj instanceof AudienceNetworkBid ? ((AudienceNetworkBid) obj).getNetworkName() : NetworkName.UNKNOWN;
    }

    public String toString() {
        Object obj = this.variantObj;
        return obj instanceof AudienceNetworkBid ? ((AudienceNetworkBid) obj).toString() : "Bid{}";
    }
}
