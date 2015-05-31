${gg.setIgnoreOutput(table.pkCount <= 1)}

<#include "/macro.include"/>
<#assign className = table.className>
<#assign classNameLower = className?uncap_first> 
package ${basepackage}.entity;

public class ${className}PK{
<#list table.columns as column>
	<#if column.pk>
	private ${column.javaType} ${column.columnNameLower};
	</#if>
</#list>

<@generateConstructor className+"PK"/>
	
<#list table.columns as column>
	<#if column.pk>
    public void set${column.columnName}(${column.javaType} value) {
        this.${column.columnNameLower} = value;
    }

	public ${column.javaType} get${column.columnName}() {
		return this.${column.columnNameLower};
	}
	</#if>
</#list>
}