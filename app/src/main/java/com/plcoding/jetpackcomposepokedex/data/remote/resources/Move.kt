package com.plcoding.jetpackcomposepokedex.data.remote.resources

data class Move(
    val move: MoveX,
    val version_group_details: List<VersionGroupDetail>
)