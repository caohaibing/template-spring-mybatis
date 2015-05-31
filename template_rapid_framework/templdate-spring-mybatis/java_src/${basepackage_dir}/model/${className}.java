<#include "/macro.include"/>

<#assign className = table.className>
<#assign classNameLower = className?uncap_first> 
package ${basepackage}.entity;

import ${basepackage}.util.DateUtils;
import com.google.common.base.MoreObjects;

public class ${className} {

    //columns START
    <#list table.columns as column>
    /* ${column.columnAlias} */
    private ${column.javaType} ${column.columnNameLower};

    </#list>
    //columns END

<@generateConstructor className/>
<@generateJavaColumns/>

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
<#list table.columns as column>
        .add("${column.columnNameLower}", ${column.columnNameLower})
</#list>
        .toString();
        }
}

<#macro generateJavaColumns>
<#list table.columns as column>
    public void set${column.columnName}(${column.javaType} value) {
            this.${column.columnNameLower} = value;
    }

    public ${column.javaType} get${column.columnName}() {
            return this.${column.columnNameLower};
    }
    <#if column.isDateTimeColumn>
    public String get${column.columnName}String() {
            return DateUtils.format(this.${column.columnNameLower});
    }
    </#if>
</#list>
</#macro>
