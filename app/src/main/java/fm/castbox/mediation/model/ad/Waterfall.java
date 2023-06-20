package fm.castbox.mediation.model.ad;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.f;
import com.google.gson.g;
import com.google.gson.h;
import com.google.gson.k;
import com.google.gson.l;
import com.google.gson.n;
import com.google.gson.o;
import fm.castbox.mediation.model.DisplayResult;
import fm.castbox.mediation.model.NetworkName;
import fm.castbox.mediation.model.ad.waterfall.admob.AdMobWaterfall;
import java.lang.reflect.Type;

/* loaded from: classes3.dex */
public class Waterfall extends BaseCompound {
    private Object variantObj;

    public static g<Waterfall> createJsonDeserializer() {
        return new g<Waterfall>() { // from class: fm.castbox.mediation.model.ad.Waterfall.2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.gson.g
            public Waterfall deserialize(h hVar, Type type, f fVar) throws l {
                Gson create = new GsonBuilder().create();
                k f10 = hVar.f();
                Waterfall waterfall = new Waterfall();
                String h10 = f10.o("network_name").h();
                h10.hashCode();
                if (h10.equals(NetworkName.GOOGLE_ADMOB)) {
                    waterfall.variantObj = create.fromJson(hVar, (Class<Object>) AdMobWaterfall.class);
                    return waterfall;
                }
                throw new l(String.format("failed to unmarshal waterfall data for network name %s", h10));
            }
        };
    }

    public static o<Waterfall> createJsonSerializer() {
        return new o<Waterfall>() { // from class: fm.castbox.mediation.model.ad.Waterfall.1
            @Override // com.google.gson.o
            public h serialize(Waterfall waterfall, Type type, n nVar) {
                if (waterfall.variantObj instanceof AdMobWaterfall) {
                    return nVar.b((AdMobWaterfall) waterfall.variantObj);
                }
                return nVar.b(null);
            }
        };
    }

    public AdMobWaterfall convertToAdMobWaterfall() {
        Object obj = this.variantObj;
        if (obj instanceof AdMobWaterfall) {
            return (AdMobWaterfall) obj;
        }
        return null;
    }

    @Override // fm.castbox.mediation.model.ad.BaseCompound
    public DisplayResult getDisplayResult(boolean z10) {
        return new DisplayResult(DisplayResult.CATEGORY_WATERFALL, z10, networkName(), getTagId());
    }

    @Override // fm.castbox.mediation.model.ad.BaseCompound
    public float getEcpm() {
        Object obj = this.variantObj;
        if (obj instanceof AdMobWaterfall) {
            return ((AdMobWaterfall) obj).getEcpmFloor();
        }
        return 0.0f;
    }

    @Override // fm.castbox.mediation.model.ad.BaseCompound
    public String getTagId() {
        Object obj = this.variantObj;
        if (obj instanceof AdMobWaterfall) {
            return ((AdMobWaterfall) obj).getAdUnitId();
        }
        return null;
    }

    @Override // fm.castbox.mediation.model.ad.BaseCompound
    public String networkName() {
        Object obj = this.variantObj;
        return obj instanceof AdMobWaterfall ? ((AdMobWaterfall) obj).getNetworkName() : NetworkName.UNKNOWN;
    }

    public String toString() {
        Object obj = this.variantObj;
        return obj instanceof AdMobWaterfall ? ((AdMobWaterfall) obj).toString() : "Waterfall{}";
    }
}
