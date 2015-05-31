
package com.quxionglie.tsm.model;

import com.google.common.base.MoreObjects;
import com.quxionglie.tsm.util.DateUtils;
import com.google.common.base.Objects;

public class SysParam {

    //columns START
    /* id */
    private Integer id;

    /* 参数key */
    private String paramKey;

    /* 参数value */
    private String paramValue;

    /* 备注 */
    private String remark;

    //columns END

	public SysParam(){
	}

	public SysParam( Integer id ){
		this.id = id;
	}

    public void setId(Integer value) {
            this.id = value;
    }

    public Integer getId() {
            return this.id;
    }
    public void setParamKey(String value) {
            this.paramKey = value;
    }

    public String getParamKey() {
            return this.paramKey;
    }
    public void setParamValue(String value) {
            this.paramValue = value;
    }

    public String getParamValue() {
            return this.paramValue;
    }
    public void setRemark(String value) {
            this.remark = value;
    }

    public String getRemark() {
            return this.remark;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
        .add("id", id)
        .add("paramKey", paramKey)
        .add("paramValue", paramValue)
        .add("remark", remark)
        .toString();
        }
}

