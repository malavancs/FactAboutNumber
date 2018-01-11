
package malavan.factaboutnumbers.factaboutnumber;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class FactResult {

    @SerializedName("date")
    private String mDate;
    @SerializedName("found")
    private Boolean mFound;
    @SerializedName("number")
    private Long mNumber;
    @SerializedName("text")
    private String mText;
    @SerializedName("type")
    private String mType;

    public String getDate() {
        return mDate;
    }

    public void setDate(String date) {
        mDate = date;
    }

    public Boolean getFound() {
        return mFound;
    }

    public void setFound(Boolean found) {
        mFound = found;
    }

    public Long getNumber() {
        return mNumber;
    }

    public void setNumber(Long number) {
        mNumber = number;
    }

    public String getText() {
        return mText;
    }

    public void setText(String text) {
        mText = text;
    }

    public String getType() {
        return mType;
    }

    public void setType(String type) {
        mType = type;
    }

}
