
package com.quxionglie.tsm.model;

import com.google.common.base.MoreObjects;
import com.quxionglie.tsm.util.DateUtils;
import com.google.common.base.Objects;

public class SysDict {

    //columns START
    /* id */
    private Integer id;

    /* 字典类型 */
    private String dictType;

    /* 字典key值 */
    private String dictKey;

    /* 字典value值 */
    private String dictValue;

    /* 排序 */
    private Integer sortSeq;

    /* 备注 */
    private String remark;

    //columns END

	public SysDict(){
	}

	public SysDict( Integer id ){
		this.id = id;
	}

    public void setId(Integer value) {
            this.id = value;
    }

    public Integer getId() {
            return this.id;
    }
    public void setDictType(String value) {
            this.dictType = value;
    }

    public String getDictType() {
            return this.dictType;
    }
    public void setDictKey(String value) {
            this.dictKey = value;
    }

    public String getDictKey() {
            return this.dictKey;
    }
    public void setDictValue(String value) {
            this.dictValue = value;
    }

    public String getDictValue() {
            return this.dictValue;
    }
    public void setSortSeq(Integer value) {
            this.sortSeq = value;
    }

    public Integer getSortSeq() {
            return this.sortSeq;
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
        .add("dictType", dictType)
        .add("dictKey", dictKey)
        .add("dictValue", dictValue)
        .add("sortSeq", sortSeq)
        .add("remark", remark)
        .toString();
        }
}

