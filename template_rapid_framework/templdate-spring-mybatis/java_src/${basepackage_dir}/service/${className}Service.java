<#include "/java_pk_name.include"/>

<#assign className = table.className>
<#assign classNameLower = className?uncap_first>
package ${basepackage}.service;

import ${basepackage}.mapper.${className}Mapper;
import ${basepackage}.model.${className};
import org.springframework.stereotype.Service;

@Service
public class ${className}Service extends AbstractService<${className}Mapper, ${className}> {
    <#list table.columns as column>
    <#if column.unique && !column.pk>
    public ${className} getBy${column.columnName}(${column.javaType} ${column.columnNameLower}) {
            return baseMapper.getBy${column.columnName}(${column.columnNameLower});
    }
    </#if>
    </#list>
}

